package com.hex.bigdata.metadata.db.jdbcinfo.helper;

import com.hex.bigdata.metadata.db.jdbcinfo.BaseJdbcInfoHelper;
import com.hex.bigdata.metadata.db.model.ColumnType;
import com.hex.bigdata.metadata.db.util.DBType;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by junjiem on 2016-6-29.
 */
public class HiveJdbcInfoHelper extends BaseJdbcInfoHelper {
    public HiveJdbcInfoHelper(Connection conn) {
        super(conn);
    }

    @Override
    public String getDbType() {
        return DBType.HIVE.getValue();
    }

    @Override
    public String getCurrentDbNameSql() {
        // 无法获取当前数据库名称
        return null;
    }

    @Override
    public String getDatabasesSql() {
        return "show databases";
    }

    @Override
    public String getTablesSql(String dbName) {
        return "show tables in `" + dbName + "`";
    }

    @Override
    public String getColumnsSql(String dbName, String tbName) {
        return "select * from `" + dbName + "`.`" + tbName + "` where 1=0";
    }

    @Override
    public List<ColumnType> getColumnTypes() throws SQLException {
        return null;
    }
}
