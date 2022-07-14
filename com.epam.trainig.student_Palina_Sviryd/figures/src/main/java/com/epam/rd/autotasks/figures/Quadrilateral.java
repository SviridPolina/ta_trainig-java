package com.epam.rd.autotasks.figures;

import static java.lang.Math.sqrt;

class Quadrilateral extends Figure {
    private Point A;
    private Point B;
    private Point C;
    private Point D;

    public Quadrilateral(Point a, Point b, Point c, Point d){
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
    }

    double length(Point A, Point B) {

        double len = sqrt((A.getX() - B.getX())*(A.getX() - B.getX()) + (A.getY() - B.getY())*(A.getY() - B.getY()));
        return len;
    }

    public double areaTrin(double lenAB, double lenBC, double lenCA) {
        //TODO
        double p = (lenAB + lenBC + lenCA) / 2;

        return sqrt(p * (p - lenAB) * (p - lenBC) * (p - lenCA));
    }

    public double area(){
        return areaTrin(length(A, B), length(A, D), length(B, D)) + areaTrin(length(C, B), length(C, D), length(B, D));
    }

    @Override
    public String pointsToString() {
        return String.format("(%s,%s)(%s,%s)(%s,%s)(%s,%s)", A.getX(), A.getY(), B.getX(), B.getY(), C.getX(), C.getY(), D.getX(), D.getY());
    }

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }

    @Override
    public Point leftmostPoint() {
        if (A.getX() <= B.getX() && A.getX() <= C.getX() && A.getX() <= D.getX()){
            return A;
        }
        else if (B.getX() <= A.getX() && B.getX() <= C.getX() && B.getX() <= D.getX()){
            return B;
        }
        else if (C.getX() <= B.getX() && C.getX() <= A.getX() && C.getX() <= D.getX()){
            return C;
        }
        else if (D.getX() <= B.getX() && D.getX() <= C.getX() && D.getX() <= A.getX()){
            return D;
        }
        return A;
    }
}
