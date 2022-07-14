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

        this.A = a;
        this.B = b;
        this.C = c;


        if ( A == null || B == null || C == null) {
            throw new IllegalArgumentException();
        }

        if ( (A.getX() == B.getX() && A.getY() == B.getY()) || (A.getX() == C.getX() && A.getY() == C.getY())
                || (A.getX() == C.getX() && A.getY() == C.getY())) {
            throw new IllegalArgumentException();
        }

        if((A.getY() - B.getY()) / (A.getX() - B.getX())==(B.getY() - C.getY()) / (B.getX() - C.getX())){
            throw new IllegalArgumentException();
        }

        this.lenAB = length(a, b);
        this.lenBC = length(b, c);
        this.lenCA = length(c, a);

        if(area() == 0){
            throw new IllegalArgumentException();
        }

        if (lenAB >= lenCA + lenBC || lenCA >= lenAB + lenBC || lenBC >= lenAB + lenCA){
            throw new IllegalArgumentException();
        }

    }

    double length(Point A, Point B) {

        double len = sqrt((A.getX() - B.getX())*(A.getX() - B.getX()) + (A.getY() - B.getY())*(A.getY() - B.getY()));
        return len;
    }

    @Override
    public Point centroid() {
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

    @Override
    public boolean isTheSame(Triangle figure) {
        if(this.A == figure.A && this.B == figure.B && this.C == figure.C){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isTheSame(Circle figure) {
        return false;
    }

    @Override
    public boolean isTheSame(Quadrilateral figure) {
        return false;
    }

    public double area() {
        //TODO
        double p = (lenAB + lenBC + lenCA) / 2;

        return sqrt(p * (p - lenAB) * (p - lenBC) * (p - lenCA));
    }

}

