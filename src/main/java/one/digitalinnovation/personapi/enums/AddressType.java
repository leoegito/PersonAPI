package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AddressType {

    BILLING("Billing Address"),
    SHIPPING("Shipping Address"),
    HOME("Home Address"),
    BUSINESS("Business Address");

    private final String description;

}
