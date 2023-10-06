package ro.itschool.project.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import ro.itschool.project.models.WeatherResponse;

import java.io.IOException;

@Service
public class WeatherServiceImpl implements WeatherService{
    @Override
    public WeatherResponse getCityWeather(String city) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://api.weatherapi.com/v1/current.json?key=ec8face8cc00456babd144815230510&q=Bucharest&aqi=no")
                .build();
        Response response = client.newCall(request).execute();

        ObjectMapper objectMapper = new ObjectMapper();

        WeatherResponse weatherResponse = objectMapper.readValue(response.body().toString(), WeatherResponse.class);

        System.out.println(weatherResponse);

        return null;
    }
}
