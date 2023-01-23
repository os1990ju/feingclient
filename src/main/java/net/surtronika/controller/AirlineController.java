package net.surtronika.controller;

import lombok.RequiredArgsConstructor;
import net.surtronika.client.ApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/airlines")
@RequiredArgsConstructor
public class AirlineController {

    private final ApiClient apiClient;

    @GetMapping
    public ResponseEntity readAirlineData (@RequestParam(required = false) String airlineId) {
        if (airlineId == null) {
            System.out.println(apiClient.readAirLines());
            return (ResponseEntity) apiClient.readAirLines();
        }
        return ResponseEntity.ok(apiClient.readAirLineById(airlineId));
    }

}