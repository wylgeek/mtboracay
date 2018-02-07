package com.hex.bigdata.udsp.rts.provider.model;

import java.io.Serializable;

/**
 * Created by tomnic on 2017/3/3.
 */
public class Column implements Serializable {

    private String name;

    private String value;

    private Short seq;

    private String describe;

    public Short getSeq() {
        return seq;
    }

    public void setSeq(Short seq) {
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
