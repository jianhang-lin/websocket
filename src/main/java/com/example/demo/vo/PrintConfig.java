package com.example.demo.vo;

public class PrintConfig {
    private String labelData;
    private String ip;
    private String port;

    public PrintConfig() {
    }

    public PrintConfig(String labelData, String ip, String port) {
        this.labelData = labelData;
        this.ip = ip;
        this.port = port;
    }

    public String getLabelData() {
        return labelData;
    }

    public void setLabelData(String labelData) {
        this.labelData = labelData;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
