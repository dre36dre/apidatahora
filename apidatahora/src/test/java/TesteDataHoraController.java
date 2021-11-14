import org.apache.coyote.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TesteDataHoraController {

    @LocalServerPort
    private int port;

    @BeforeEach
    void setup(){
        RestAssured.port=port;
    }
    @Test
    void deveRetornaDataHoraComTimeZoneDefault(){
        var metodo="GET";
        var   endpoint="/data-hora";

        var response RESPONSE =   when()
    }
}
