package com.locationUpdateEndUser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaEndUserConfig {

	@KafkaListener(topics = AppEndUserConstants.LOCATION_UPDATE_PRODUCER_TOPIC, groupId = AppEndUserConstants.GROUP_ID)
	public void updatedLocation(String value) {
		System.out.println(value);
	}
}
