import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.nio.charset.StandardCharsets;
import java.net.URLEncoder;
public class JsonHttpPostRequest{
    public static String sendJSONPostRequest(String apiUrl, Map<String, Object> jsonData) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set the request method to POST
        connection.setRequestMethod("POST");

        // Set the request headers if needed
        connection.setRequestProperty("Content-Type", "application/json");
//        connection.setRequestProperty("Authorization", "Bearer YOUR_API_KEY");

        // Enable input/output streams
        connection.setDoOutput(true);

        // Convert the JSON data to a string
        String jsonPayload = mapToJsonString(jsonData);

        // Write the JSON payload to the request body
        try (OutputStream os = connection.getOutputStream();
             OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8)) {
            osw.write(jsonPayload);
        }

        // Get the response from the server
        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                return in.lines().collect(Collectors.joining());
            }
        } else {
            throw new IOException("HTTP Error: " + responseCode);
        }
    }

    // Helper function to convert a map to a JSON string
    private static String mapToJsonString(Map<String, Object> map) throws UnsupportedEncodingException {
        String data = map.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8))
                .collect(Collectors.joining("&"));
        return data;
    }
}

SHIMOTOKATATE