package com.knimbus.config;


import org.aeonbits.owner.Config;

@Config.Sources(value="file:${user.dir}/src/test/resources/config/config.properties")
public interface FrameworkConfig extends Config {
    long timeouts();
    String url();

    String browser();
}
