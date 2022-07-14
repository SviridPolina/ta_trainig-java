package com.epam.rd.autotasks.figures;

import static java.lang.Math.sqrt;

class Triangle extends Figure {
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

        return sqrt(p * (p - lenAB) * (p - lenBC) * (p - lenCA));
    }

    @Override
    public String pointsToString() {
        return String.format("(%s,%s)(%s,%s)(%s,%s)", A.getX(), A.getY(), B.getX(), B.getY(), C.getX(), C.getY());
    }

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }

    @Override
    public Point leftmostPoint() {
        if(A.getX() < B.getX()){
            if(A.getX() < C.getX()){
                return A;
            }
            else {
                return C;
            }
        }
        else{
            if(B.getX() < C.getX()){
                return B;
            }
            else{
                return C;
            }
        }
    }
}
