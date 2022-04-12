package com.navneet.springweb.healthchecks;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator{

	@Override
	public Health health() {
		boolean error = true;
		
		return error == false ? Health.up().build() : Health.down().withDetail("Error Key", 404).build();
	}

}
