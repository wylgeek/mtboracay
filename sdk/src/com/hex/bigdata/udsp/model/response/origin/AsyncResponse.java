package com.hex.bigdata.udsp.model.response.origin;

/**
 * Created with IntelliJ IDEA
 * Author: tomnic.wang
 * DATE:2017/7/19
 * TIME:20:58
 */
public class AsyncResponse extends UdspResponse {
    /**
     * //返回信息，异步返回文件路径信息
     */
    private String responseContent;

    public String getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(String responseContent) {
        this.responseContent = responseContent;
    }
}
