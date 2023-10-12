package ro.itschool.project.models.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponseDTO {

    private String name;

    private String text;

    private LocalDateTime last_updated;

}
