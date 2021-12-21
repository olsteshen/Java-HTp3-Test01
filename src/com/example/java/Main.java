package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vector [] arrVector;
        Vector myVector1 = new Vector(1,1,1);
        Vector myVector2 = new Vector(3,3,3);
        Vector myVector3 = new Vector();

        double vol, dot;
        vol = myVector3.length();
        System.out.println(vol);

        dot = myVector1.dotProduct(myVector2);
        System.out.println(dot);
    }
}
