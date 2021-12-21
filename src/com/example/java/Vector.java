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

}


