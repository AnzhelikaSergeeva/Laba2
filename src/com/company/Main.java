package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Determination of coordinates
        Scanner sx1 = new Scanner(System.in);
        Scanner sy1 = new Scanner(System.in);
        Scanner sz1 = new Scanner(System.in);
        int x1 = sx1.nextInt();
        int y1 = sy1.nextInt();
        int z1 = sz1.nextInt();

        Scanner sx2 = new Scanner(System.in);
        Scanner sy2 = new Scanner(System.in);
        Scanner sz2 = new Scanner(System.in);
        int x2 = sx2.nextInt();
        int y2 = sy2.nextInt();
        int z2 = sz2.nextInt();

        Scanner sx3 = new Scanner(System.in);
        Scanner sy3 = new Scanner(System.in);
        Scanner sz3 = new Scanner(System.in);
        int x3 = sx3.nextInt();
        int y3 = sy3.nextInt();
        int z3 = sz3.nextInt();

        //Initialization of points
        Point3d point1 = new Point3d(x1, y1, z1);
        Point3d point2 = new Point3d(x2, y2, z2);
        Point3d point3 = new Point3d(x3, y3, z3);

        //Точка со значениями по умолчанию
        Point3d point4 = new Point3d();

        if (!point1.equalTo(point2) && !point2.equalTo(point3) && !point3.equalTo(point1))
            System.out.println(Point3d.computeArea(point1, point2, point3));
        else System.out.println("Your input is incorrect");
    }
}
