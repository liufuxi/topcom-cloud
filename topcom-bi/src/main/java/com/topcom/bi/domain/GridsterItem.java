package com.topcom.bi.domain;

import net.sf.json.JSONObject;

/**
 * Created by lsm on 2018/3/2 0002.
 */
public class GridsterItem {
    private String id;
    private String type;
    private JSONObject option;
    private JSONObject data;
    private JSONObject style;
    private Interface dataInterface;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public JSONObject getOption() {
        return option;
    }

    public void setOption(JSONObject option) {
        this.option = option;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    public JSONObject getStyle() {
        return style;
    }

    public void setStyle(JSONObject style) {
        this.style = style;
    }

    public Interface getDataInterface() {
        return dataInterface;
    }

    public void setDataInterface(Interface dataInterface) {
        this.dataInterface = dataInterface;
    }
}
