package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Consumer {
    public static void main(String[] args) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> jsonToSend = new HashMap<>();
        jsonToSend.put("name", "Test name");
        jsonToSend.put("job", "test");
        HttpEntity<Map<String, String>> request = new HttpEntity<>(jsonToSend);

        String url ="https://reqres.in/api/users/2";
//        String response =  restTemplate.postForObject(url, request, String.class);
       ReqResponse response =  restTemplate.getForObject(url, ReqResponse.class);
//        String response =  restTemplate.getForObject(url, String.class);
        System.out.println(response);

//        System.out.println("response: - " +response);
//        ObjectMapper mapper = new ObjectMapper();
//        JsonNode obj = mapper.readTree(response);
//        System.out.println(String.valueOf(obj.get("data").get("email")));

    }
}
