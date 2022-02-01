package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.AddressDTO;
import one.digitalinnovation.personapi.entity.Address;
import one.digitalinnovation.personapi.enums.AddressType;

public class AddressUtils {

    private static final AddressType TYPE = AddressType.HOME;
    private static final String CEP = "99999999";
    private static final String STREET = "East Broadway";
    private static final String HOUSENUMBER = "217";
    private static final String DISTRICT = "Community District 103";
    private static final String CITY = "New York";
    private static final String STATE = "New York";

    private static final Long ADDRESS_ID = 1L;

    public static AddressDTO createFakeDTO(){
        return AddressDTO.builder()
                .type(TYPE)
                .cep(CEP)
                .street(STREET)
                .houseNumber(HOUSENUMBER)
                .district(DISTRICT)
                .city(CITY)
                .state(STATE)
                .build();
    }

    public static Address createFakeEntity(){
        return Address.builder()
                .id(ADDRESS_ID)
                .type(TYPE)
                .cep(CEP)
                .street(STREET)
                .houseNumber(HOUSENUMBER)
                .district(DISTRICT)
                .city(CITY)
                .state(STATE)
                .build();
    }


}
