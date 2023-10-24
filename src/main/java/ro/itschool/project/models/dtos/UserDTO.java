package ro.itschool.project.models.dtos;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {

    private Long id;

    //@NotEmpty(message = "This field should not be empty")
    private String firstName;

    //@NotEmpty
    private String lastName;

    //@NotEmpty
    private String email;


    private int age;




}
