package com.example.ribonclient.ribonclientdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;

public class RibbonConfiguration {
	@Autowired
    IClientConfig config;
 
	/**
	 * The PingUrl implementation checks if services are alive. We want to change
	 * the default URL and point it to /health since we want to avoid requests to
	 * unmapped root contexts. The false flag is just to indicate that the endpoint
	 * is not secured
	 * 
	 * @param config
	 * @return
	 */
    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl();
    }
 
	/**
	 * The AvailabilityFilteringRule is an alternative to the default RoundRobinRule
	 * that takes into account the availability being checked by our new pings.
	 * 
	 * @param config
	 * @return
	 */
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new AvailabilityFilteringRule();
    }
}
