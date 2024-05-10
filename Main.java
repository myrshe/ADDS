package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vector vec = new Vector(2,5);
        Vector vec1 = new Vector(4, 10);
        Vector vec2 = new Vector(3,9);
        Vector vec3 = new Vector(8,3);
        Vector vec4 = new Vector(6, 18);

        List<Vector> vectors = new ArrayList<>();
        vectors.add(vec);
        vectors.add(vec1);
        vectors.add(vec2);
        vectors.add(vec3);
        vectors.add(vec4);

        List<List<Vector>> collinearGroups = Collinear.findCollinearVectors(vectors);

        System.out.println("Коллинеарные отрезки:");

        collinearGroups.forEach(innerList -> {
            System.out.println(innerList.toString());
        });

    }
}
