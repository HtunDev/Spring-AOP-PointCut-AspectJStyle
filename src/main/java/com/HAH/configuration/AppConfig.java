package com.HAH.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan({
	"com.HAH.admin",
	"com.HAH.member",
	"com.HAH.aspect"
})
public class AppConfig {

}
