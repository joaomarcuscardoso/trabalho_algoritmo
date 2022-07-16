/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectmeJoaoeLuis.Helper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author smile
 */
public class Json {
    private static ObjectMapper objectMapper = getDefaultObjectMapper();
    
    private static ObjectMapper getDefaultObjectMapper() {
         ObjectMapper defaultObjectMapper = new ObjectMapper();
         return defaultObjectMapper;
    }
    
    
    public static JsonNode parse(String src) throws JsonProcessingException {
        return objectMapper.readTree(src);
    }
    
}
