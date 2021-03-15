package com.example.demo.vo;

public class PrintConfigBuilder {
    private String labelData;
    private String ip;
    private String port;

    public PrintConfigBuilder() {
    }

    public PrintConfigBuilder(String labelData, String ip, String port) {
        this.labelData = labelData;
        this.ip = ip;
        this.port = port;
    }

    public PrintConfig create() {
        return new PrintConfig(this.labelData, this.ip, this.port);
    }

    public PrintConfigBuilder labelData(String labelData) {
        this.labelData = labelData;
        return this;
    }

    public PrintConfigBuilder ip(String ip) {
        this.ip = ip;
        return this;
    }

    public PrintConfigBuilder port(String port) {
        this.port = port;
        return this;
    }

}
