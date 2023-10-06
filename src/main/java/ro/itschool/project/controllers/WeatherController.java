package ro.itschool.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.itschool.project.models.WeatherResponse;
import ro.itschool.project.services.WeatherService;

import java.io.IOException;

@RestController
public class WeatherController {



    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/api/weather")
    public ResponseEntity<WeatherResponse> getWeather(@RequestParam String city) throws IOException {
        //city name
        //current weather description
        //last time updated
        //../api/weather?city=London
        //weatherService.getCityWeather(city)
        return ResponseEntity.ok(weatherService.getCityWeather(city));
    }
}
