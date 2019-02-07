package Handlers.Json;

import com.google.gson.Gson;

public class JsonHandler {

    public static String convertToJson(Object object)
    {
        Gson gson = new Gson();
        return gson.toJson(object);
    }

    public static <T> T convertFromJson(String json, Class<T>  classType)
    {
        Gson gson = new Gson();
        return gson.fromJson(json, classType);
    }



}
