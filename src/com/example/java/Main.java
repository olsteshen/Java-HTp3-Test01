package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vector [] arrVector;
        Vector myVector1 = new Vector(1,1,1);
        Vector myVector2 = new Vector(3,3,3);
        Vector myVector3 = new Vector();
        System.out.println("Random vector is " + myVector3);

        double vol, dot;
        vol = myVector1.length();
        System.out.println("The length of vector 1 is " + vol);
        dot = myVector1.dotProduct(myVector2);
        System.out.println("The dot product of vectors 1&2 " + dot);
        Vector.createArray(5);

    }
}
