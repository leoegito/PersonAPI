package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.AddressType;

import javax.persistence.*;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AddressType type;

    @Column(nullable = false)
    private String cep;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String houseNumber;

    private String additionalDetails;

    @Column(nullable = false)
    private String district;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String state;


}
