package al.vibe.nile.user.costumer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CostumerDto {
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String username;
    private String email;
    @JsonProperty("phone_number")
    private String phoneNumber;
    private String address;
}
