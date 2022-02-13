package com.company;

import static java.lang.Math.sqrt;

public class Point3d {
    // координата X
    private double xCoord;
    //  координата Y
    private double yCoord;
    //  координата Z
    private double zCoord;
    // Конструктор инициализации
    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    //  Конструктор по умолчанию.
    public Point3d () {
        //Вызовите конструктор с тремя параметрами и определите источник.
        this(0.0, 0.0, 0.0);
    }
    // Возвращение координаты X
    public double getX () {return xCoord;}
    // Возвращение координаты Y
    public double getY () {return yCoord;}
    // Возвращение координаты Z
    public double getZ () {return zCoord;}

    // Установка значения координаты X.
    public void setX ( double val) {xCoord = val;}
    // Установка значения координаты Y.
    public void setY ( double val) {yCoord = val;}
    // Установка значения координаты Z.
    public void setZ ( double val) {zCoord = val;}

    public boolean equalTo(Point3d point1){
        if ((point1.getX() == this.getX()) && (point1.getY() == this.getY()) && (point1.getZ() == this.getZ()))
            return true;
        else return false;
    }

    //Поск расстояний между двумя координатами
    public static double distanceTo(Point3d point1, Point3d point2){
        double x1 = point1.getX(), y1 = point1.getY(), z1 = point1.getZ();
        double x2 = point2.getX(), y2 = point2.getY(), z2 = point2.getZ();
        return sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) + (z2-z1)*(z2-z1));
    }

    // Calculates the area of a triangle given by three points
    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double a = distanceTo(point1, point2);
        double b = distanceTo(point2, point3);
        double c = distanceTo(point1, point3);
        double p = (a + b + c)/2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
