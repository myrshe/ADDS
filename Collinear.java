package org.example;
import java.util.*;


public class Collinear {

    private final static double CONSTANT = 1e-9;

    /**
     * Finds collinear vectors from the list.
     * @param points The list of vectors.
     * @return List of collinear vector lists.
     */
    public static List<List<Vector>> findCollinearVectors(List<Vector> points) {

        if (points == null || points.size() < 2) {
            return new ArrayList<>();
        }

        List<List<Vector>> collinearGroups = new ArrayList<>();
        for (int i = 0; i < points.size(); i++) {

            List<Vector> collinearWithI = new ArrayList<>();
            collinearWithI.add(points.get(i));
            for (int j = 0; j < points.size(); j++) {
                if (i == j) continue;
                double angle = points.get(i).getAngle(points.get(j));
                if (angle < CONSTANT) {
                    collinearWithI.add(points.get(j));
                    points.remove(j);
                }
            }

            if (collinearWithI.size() != 1) {
                collinearGroups.add(collinearWithI);
            }


        }
         return collinearGroups;
    }
}
