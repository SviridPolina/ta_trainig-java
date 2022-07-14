package com.epam.rd.autotasks.triangle;

import static java.lang.Math.sqrt;

class Triangle {

    private Point A;
    private Point B;
    private Point C;

    private double lenAB;
    private double lenBC;
    private double lenCA;

    public Triangle(Point a, Point b, Point c) {
        //TODO
        this.lenAB = length(a, b);
        this.lenBC = length(b, c);
        this.lenCA = length(c, a);

        if (lenAB >= lenCA + lenBC || lenCA >= lenAB + lenBC || lenBC >= lenAB + lenCA){
            throw new IllegalArgumentException();
        }

        this.A = a;
        this.B = b;
        this.C = c;
    }

    double length(Point A, Point B) {

        double len = sqrt((A.getX() - B.getX())*(A.getX() - B.getX()) + (A.getY() - B.getY())*(A.getY() - B.getY()));
        return len;
    }

    public double area() {
        //TODO
        double p = (lenAB + lenBC + lenCA) / 2;

        return Math.sqrt(p * (p - lenAB) * (p - lenBC) * (p - lenCA));
    }

    public Point centroid(){
        //TODO
        Point A1 = new Point((B.getX() + C.getX()) / 2, (B.getY() + C.getY()) / 2);
        Point B1 = new Point((A.getX() + C.getX()) / 2, (A.getY() + C.getY()) / 2);

        double Kof1 = (A.getY() - A1.getY()) / (A.getX() - A1.getX());
        double Bof1 = A.getY() - Kof1 * A.getX();

        double Kof2 = (B.getY() - B1.getY()) / (B.getX() - B1.getX());
        double Bof2 = B.getY() - Kof2 * B.getX();

        double x = (Bof2 - Bof1) / (Kof1 - Kof2);
        double y = Kof1 * x + Bof1;

        Point p = new Point(x, y);
        return p;
    }

}
