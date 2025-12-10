package demo.semana13;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("pepe", "nieto", 30, "pepenieto@gmail.com");
        Gson gson = new Gson();
        String json = gson.toJson(persona);
        System.out.println(json);
    }
}