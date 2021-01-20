package com.eddie.mybatisplusmul.enums;

/**
 * @Author: eddie
 * @Date: 2021/1/20 16:24
 **/
public enum DataSourceEnum {
    DB1("db1"),DB2("db2");

    private String value;

    DataSourceEnum(String value){this.value=value;}

    public String getValue() {
        return value;
    }
}
