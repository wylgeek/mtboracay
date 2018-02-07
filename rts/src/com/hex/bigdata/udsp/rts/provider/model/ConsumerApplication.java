package com.hex.bigdata.udsp.rts.provider.model;

import com.hex.bigdata.udsp.rts.model.RtsConsumer;

import java.io.Serializable;

/**
 * Created by tomnic on 2017/3/3.
 */
public class ConsumerApplication  implements Serializable {

    private ConsumerMatedata matedata;

    private String name;

    private String describe;

    private String note;

    public ConsumerApplication (RtsConsumer rtsConsumer,ConsumerMatedata matedata){
        this.matedata=matedata;
        this.name=rtsConsumer.getName();
        this.describe=rtsConsumer.getDescribe();
        this.note=rtsConsumer.getNote();
    }
    public ConsumerMatedata getMatedata() {
        return matedata;
    }

    public void setMatedata(ConsumerMatedata matedata) {
        this.matedata = matedata;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
