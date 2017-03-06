package com.desktop.model;

/**
 * Created by ME on 3/6/2017.
 */
public class Data {

    private String dataId;

    private String data;

    public Data() {
    }

    public Data(String dataId, String data) {
        this.dataId = dataId;
        this.data = data;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
