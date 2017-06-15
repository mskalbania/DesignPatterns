package currencyExchanger;

import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

public class JSONReader {

    private static String readAll(Reader reader) throws IOException {

        StringBuilder output = new StringBuilder();
        int temp;
        while ((temp = reader.read()) != -1) {
            output.append((char) temp);
        }
        return output.toString();
    }

    public static JSONObject getJSON(String URL) throws IOException {
        InputStream inputStream = new URL(URL).openStream();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                inputStream, Charset.forName("UTF-8")))) {

            String temp = readAll(br);
            String JSONText = temp.substring(1, temp.length() - 1);//removing [ ] from json string
            return new JSONObject(JSONText);
        }
    }
}
