import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import JsonHttpPostRequest;

public class HttpPost {
    public static void main(String[] args) {
        try {
            String apiUrl = "https://example.com/api/endpoint";
            Map<String, Object> jsonData = new HashMap<>();
            jsonData.put("key1", "value1");
            jsonData.put("key2", "value2");

            String response = JsonHttpPostRequest.sendJSONPostRequest(apiUrl, jsonData);
            System.out.println("Response: " + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}