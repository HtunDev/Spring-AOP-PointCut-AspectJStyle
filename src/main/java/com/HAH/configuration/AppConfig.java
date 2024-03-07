package com.HAH.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan({
	"com.HAH.admin",
	"com.HAH.member",
	"com.HAH.aspect"
})
@ImportResource(locations = "Schema.xml")
public class AppConfig {

}
