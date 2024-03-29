package com.zavadimka.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/driver.properties")
public interface DriverConfig extends Config{

    @Key("browser.name")
    String browserName();

    @Key("browser.version")
    String browserVersion();

    @Key("browser.size")
    String browserSize();

}