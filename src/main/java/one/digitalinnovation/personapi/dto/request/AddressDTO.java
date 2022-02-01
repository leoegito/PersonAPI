package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.AddressType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private AddressType type;

    @NotEmpty
    @Size(min = 8, max = 8)
    private String cep;
    @NotEmpty
    @Size(min = 6, max = 50)
    private String street;
    @NotEmpty
    private String houseNumber;

    private String additionalDetails;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String district;
    @NotEmpty
    @Size(min = 2, max = 35)
    private String city;
    @NotEmpty
    @Size(min = 2, max = 35)
    private String state;

}
