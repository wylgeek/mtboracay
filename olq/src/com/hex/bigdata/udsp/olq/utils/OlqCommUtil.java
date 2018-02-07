package com.hex.bigdata.udsp.olq.utils;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Author: tomnic.wang
 * DATE:2017/10/13
 * TIME:15:54
 */
public class OlqCommUtil {

    private static Map<String, Statement> statementPool = new HashMap<>();

    public static synchronized Statement getStatement(String key) {
        return statementPool.get(key);
    }

    public static synchronized Statement removeStatement(String key) {
        return statementPool.remove(key);
    }

    public static synchronized void putStatement(String key, Statement statement) {
        statementPool.put(key, statement);
    }

    /**
     * 杀死正在执行的SQL
     */
    public static void cancel(String consumeId) throws SQLException {
        Statement stmt = removeStatement(consumeId);
        if (stmt != null) {
            stmt.cancel();
            stmt.close();
        }
    }

    /**
     * 元数据列信息插入到Map
     *
     * @param rsmd
     * @return
     */
    public static LinkedHashMap<String, String> putColumnIntoMap(ResultSetMetaData rsmd) {
        LinkedHashMap<String, String> columnMap = new LinkedHashMap<>();
        try {
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                columnMap.put(rsmd.getColumnName(i), rsmd.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return columnMap;
    }
}
