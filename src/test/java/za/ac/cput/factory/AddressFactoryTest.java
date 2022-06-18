package za.ac.cput.factory;
/*
        AddressFactoryTest.java
        Address Factory Test
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 12 June 2022
 */
import org.junit.jupiter.api.Assertions;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.City;
import za.ac.cput.domain.Country;


import static org.junit.jupiter.api.Assertions.*;

public class AddressFactoryTest {

    private Country country = CountryFactory.build("South Africa", "South Africa");
    private City city = CityFactory.createCity("7", "Cape Town", country);

    @org.junit.jupiter.api.Test
    void createAddress() {
        Address address = AddressFactory.createAddress(
                "H0307",
                "Struben Park",
                "123",
                "Main Street",
                7755,
                city
        );
        System.out.println(address);
        assertNotNull(address);
    }

    @org.junit.jupiter.api.Test
    void createFailAddress() {
        IllegalArgumentException thrown = Assertions
                .assertThrows(IllegalArgumentException.class, () -> {
                    Address address = AddressFactory.createAddress("H0307","Struben Park","", "", 999, null );
                }, "IllegalArgumentException was expected");

        //assertEquals("streetNumber, streetName, postalCode and city mandatory attributes.",thrown.getMessage());
    }
}
