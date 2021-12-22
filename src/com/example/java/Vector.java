package com.example.java;

import java.util.Random;

public class Vector {
    int x, y, z;

    //parameterized constructor
    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //constructor overloading for a random vector
    public Vector (){
        Random random = new Random();
        x = random.nextInt();
        y = random.nextInt();
        z = random.nextInt();
    }

    //calculate length
    double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    //calculate dot product
    double dotProduct(Vector n) {
        return this.x * n.x + this.y * n.y + this.z * n.z;
    }

    static Vector[] createArray(int n) {
        Vector[] rVectors = new Vector[n];
        for (int i = 0; i <rVectors.length; i++){
            rVectors[i] = new Vector();
        }
        for (Vector rVector : rVectors) {
            System.out.println(rVector);
        }
        return rVectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}


