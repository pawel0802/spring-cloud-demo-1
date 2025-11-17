package com.group4.otherservice;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
@Log
@RequiredArgsConstructor
public class OtherRestAdapter {

    private final RestTemplate restTemplate;

    @Value("${api.hello}")
    private URI helloUri;

    public void printGreeting() {

        try {
            ResponseEntity<String> response = restTemplate.getForEntity(helloUri, String.class);
            log.info(response.getBody() + " Pawel");
        } catch (Exception e) {
            log.info("Exception: " + e.getMessage());
        }
    }
}
