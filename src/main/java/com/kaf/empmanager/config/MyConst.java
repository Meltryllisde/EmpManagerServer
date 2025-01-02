package com.kaf.empmanager.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.constant.attendance")
public class MyConst {
    private String onTime;
    private String offTime;

    // Getters and Setters
    public String getOnTime() {
        return onTime;
    }

    public void setOnTime(String onTime) {
        this.onTime = onTime;
    }

    public String getOffTime() {
        return offTime;
    }

    public void setOffTime(String offTime) {
        this.offTime = offTime;
    }
}
