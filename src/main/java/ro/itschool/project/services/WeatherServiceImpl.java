package ro.itschool.project.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import ro.itschool.project.models.dtos.WeatherResponseDTO;

import java.io.IOException;

@Service
public class WeatherServiceImpl implements WeatherService{
    @Override
    public WeatherResponseDTO getCityWeather(String city) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://api.weatherapi.com/v1/current.json?key=ec8face8cc00456babd144815230510&q=Bucharest&aqi=no")
                .build();
        Response response = client.newCall(request).execute();

        ObjectMapper objectMapper = new ObjectMapper();

        WeatherResponseDTO weatherResponseDTO = objectMapper.readValue(response.body().toString(), WeatherResponseDTO.class);

        System.out.println(weatherResponseDTO);

        return null;
    }
}
