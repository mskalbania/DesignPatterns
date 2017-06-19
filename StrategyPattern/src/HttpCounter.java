import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.Arrays;

public class HttpCounter implements LetterCounter{

    private String url;
    private String textToAnalyse;

    public HttpCounter(String url) {
        this.url = url;
    }

    private void readAllFromHttp(){
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(this.url);
        try {
            HttpResponse response = httpClient.execute(request);
            textToAnalyse = IOUtils.toString(response.getEntity().getContent(),"UTF-8");

        } catch (IOException e) {
            throw new RuntimeException("Caused by IOE " + e.getMessage());
        }
    }

    @Override
    public long countWords(String wordPattern) {
        readAllFromHttp();
        String[] textToAnalyzeArray = textToAnalyse.split("\n");
        return Arrays.stream(textToAnalyzeArray)
                .filter(string -> string.equals(wordPattern))
                .count();
    }
}
