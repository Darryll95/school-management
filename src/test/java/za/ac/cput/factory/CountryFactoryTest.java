package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Country;
import static org.junit.jupiter.api.Assertions.*;
class CountryFactoryTest {
    @Test
    public void buildCountry(){
        Country country= CountryFactory.build
                ("STUDE12365","Nigeria");
        System.out.println(country);
        assertNotNull(country);
    }
    @Test void notPassed(){
        Exception exception= assertThrows
                ((IllegalArgumentException.class),()->CountryFactory.build(null,"Nigeria"));
        String exceptionMessage = exception.getMessage();
        System.out.println
                (exceptionMessage);
        assertNotSame
                ("please insert countryID", exceptionMessage);
    }
}
