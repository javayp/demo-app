package com.dap.model;

import java.util.List;

/**
 * Created by ME on 3/6/2017.
 */
public class Data {

    private String dataId;

    private String data;

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
