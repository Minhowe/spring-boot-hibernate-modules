package com.ipanda.config;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//加载时读取某配置文件配置
@PropertySource(value = "application-schoolinfo.properties")
@Component
public class LoadProperties {

}
