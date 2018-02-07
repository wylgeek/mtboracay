package com.hex.bigdata.udsp.model.request;

import com.hex.bigdata.udsp.model.Page;

import java.util.Map;

/**
 * 交互查询 syncStart方法和asyncStart方法参数模型
 * Created with IntelliJ IDEA
 * Author: tomnic.wang
 * DATE:2017/5/15
 * TIME:11:04
 */
@Deprecated
public class IqRequest extends UdspRequest {

    /**
     * 分页参数
     */
    private Page page;

    /**
     * 查询参数Map
     */
    private Map<String, String> data;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }
}
