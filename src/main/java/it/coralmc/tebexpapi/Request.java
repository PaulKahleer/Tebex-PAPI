package it.coralmc.tebexpapi;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;

public class Request {

    public enum Method {
        GET("GET"),
        POST("POST");

        private String stringRep = "";
        private Method(String stringRep) {
            this.stringRep = stringRep;
        }

        @Override
        public String toString() {
            return this.stringRep;
        }
    }
    public static class Response {

        private int code;
        private String content;

        protected Response(int code, String content) {
            this.code = code;
            this.content = content;
        }

        public int getCode() {
            return this.code;
        }
        public String getContent() {
            return this.content;
        }
    }

    private Method method;
    private String baseUrl = "";
    private String fullUrl = "";
    private HashMap<String,String> headers = new HashMap<>();

    public Request(String url) {
        this.baseUrl = url;
        this.fullUrl = this.baseUrl;
    }

    public Request setMethod(Method method) {
        this.method = method;
        return this;
    }

    public Request appendPath(String subpath) {
        this.fullUrl += subpath+"/";
        return this;
    }

    public Request setHeader(String key, String value) {
        headers.put(key, value);
        return this;
    }

    public Response complete() throws IOException {
        HttpsURLConnection request = (HttpsURLConnection)new URL(this.fullUrl).openConnection();
        request.setRequestMethod(this.method.toString());

        headers.forEach(request::setRequestProperty);

        int responseCode = request.getResponseCode();
        String content = new String(request.getInputStream().readAllBytes());

        return new Response(responseCode, content);
    }
}
