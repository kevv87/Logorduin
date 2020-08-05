package Tests.Jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        String json = "{\"Key\":\"Value\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode jnode = mapper.readTree(json);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
