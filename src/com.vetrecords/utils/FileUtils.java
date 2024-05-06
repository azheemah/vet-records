package com.vetrecords.utils;

import com.vetrecords.models.Pet;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static void savePetsToFile(String filename, List<Pet> pets) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(pets);
        }
    }

    public static List<Pet> loadPetsFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<Pet>) in.readObject();
        }
    }
}