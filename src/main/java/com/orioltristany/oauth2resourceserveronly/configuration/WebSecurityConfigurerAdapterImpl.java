package com.orioltristany.oauth2resourceserveronly.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(-1)
public class WebSecurityConfigurerAdapterImpl extends WebSecurityConfigurerAdapter {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void configure(WebSecurity web) throws Exception {
		logger.trace("configure-WebSecurity");
//		for (String freePattern : buildIgnoredPatternsString().split(properties.getSeparator())) {
//			web.ignoring().antMatchers(freePattern);
//		}
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		logger.trace("configure-WebSecurity");
//		for (String freePattern : buildIgnoredPatternsString().split(properties.getSeparator())) {
//			http.antMatcher(freePattern).authorizeRequests().anyRequest().permitAll();
//		}
	}

//	private String buildIgnoredPatternsString() {
//		logger.trace("configure-WebSecurity");
//		return properties.getWhiteListPatterns() + properties.getSeparator() + properties.getBlackListPatterns();
//	}
}