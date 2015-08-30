package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        final String filePath = "/home/andrey/Public/Java projects/JSON1/json.txt";
        final String result = new String(Files.readAllBytes(Paths.get(filePath)));

        Gson gson = new GsonBuilder().create();
        JSON json = (JSON) gson.fromJson(result, JSON.class);

        System.out.println("\nJSON:\n\t" + gson.toJson(json) + "\n");

        System.out.println("name:    " + json.name);
        System.out.println("surname: " + json.surname);
        System.out.println("phones:  " + Arrays.toString(json.phones));
        System.out.println("sites:   " + Arrays.toString(json.sites));
        System.out.println("address");
        System.out.println("country: " + json.address.country);
        System.out.println("city:    " + json.address.city);
        System.out.println("street:  " + json.address.street);
    }
}
