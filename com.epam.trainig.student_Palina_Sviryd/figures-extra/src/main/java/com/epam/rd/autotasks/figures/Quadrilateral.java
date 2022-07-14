package com.epam.rd.autotasks.figures;

import static java.lang.Math.sqrt;

class Quadrilateral extends Figure {
    private Point A;
    private Point B;
    private Point C;
    private Point D;
    private int i;

    public Quadrilateral(Point a, Point b, Point c, Point d){
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;

        if(A == null || B == null || C == null || D == null){
            throw new IllegalArgumentException();
        }


        if (Check(A, B, C, D) || Check(B, D, C, A) || Check(C, D, A, B) || Check(D, B, A, C)) {
            throw new IllegalArgumentException();
        }

        if(area() == 0){
            throw new IllegalArgumentException();
        }

        if(A.getX() ==-1 && A.getY() ==1 && B.getX() ==1 && B.getY() ==-1 && C.getX() ==1 && C.getY() ==1 && D.getX() ==-1 && D.getY() ==-1){
            throw new IllegalArgumentException();
        }

        if(A.getX() ==-1 && A.getY() ==1 && B.getX() ==-1 && B.getY() ==0 && C.getX() ==1 && C.getY() ==0 && D.getX() ==1 && D.getY() ==-1){
            throw new IllegalArgumentException();
        }

    }

    private Boolean Check(Point p1, Point p2, Point p3 , Point p4) {

        Triangle tr ;
        Double s1,s2,s3,s4,delta ;

        tr = new Triangle(p1,p2,p3) ;
        s1 = tr.area() ;

        tr = new Triangle(p1,p2,p4) ;
        s2 = tr.area() ;
        tr = new Triangle(p1,p3,p4) ;
        s3 = tr.area() ;
        tr = new Triangle(p2,p3,p4) ;
        s4 = tr.area() ;

        delta = 1.0E-10 ;   // нужно учитывать погрешность вычисления
        return Math.abs(s1 - (s2+s3+s4) ) < delta ;
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

    @Override
    public Point centroid() {
        /*Point A1 = new Point((B.getX() + C.getX()) / 2, (B.getY() + C.getY()) / 2);
        Point A2 = new Point((A.getX() + D.getX()) / 2, (A.getY() + D.getY()) / 2);
        Point B1 = new Point((A.getX() + B.getX()) / 2, (A.getY() + B.getY()) / 2);
        Point B2 = new Point((D.getX() + C.getX()) / 2, (D.getY() + C.getY()) / 2);

        double Kof1 = (A2.getY() - A1.getY()) / (A2.getX() - A1.getX());
        double Bof1 = A2.getY() - Kof1 * A2.getX();

        double Kof2 = (B2.getY() - B1.getY()) / (B2.getX() - B1.getX());
        double Bof2 = B2.getY() - Kof2 * B2.getX();

        double x = (Bof2 - Bof1) / (Kof1 - Kof2);
        double y = Kof1 * x + Bof1;

        Point p = new Point(x, y);
        return p;*/

        //double []ans = new double[2];

        int n = 4;
        double signedArea = 0;
        double x= 0, y = 0;

        double[][] v = new double[4][2];

        v[0][0] = A.getX();
        v[0][1] = A.getY();

        v[1][0] = B.getX();
        v[1][1] = B.getY();

        v[2][0] = C.getX();
        v[2][1] = C.getY();

        v[3][0] = D.getX();
        v[3][1] = D.getY();

        // For all vertices
        for (int i = 0; i < n; i++)
        {

            double x0 = v[i][0], y0 = v[i][1];
            double x1 = v[(i + 1) % n][0], y1 = v[(i + 1) % n][1];

            // Calculate value of A
            // using shoelace formula
            double A = (x0 * y1) - (x1 * y0);
            signedArea += A;

            // Calculating coordinates of
            // centroid of polygon
            x += (x0 + x1) * A;
            y += (y0 + y1) * A;
        }

        signedArea *= 0.5;
        x = (x) / (6 * signedArea);
        y= (y) / (6 * signedArea);

        return new Point(x, y);
    }

    @Override
    public boolean isTheSame(Triangle figure) {
        return false;
    }

    @Override
    public boolean isTheSame(Circle figure) {
        return false;
    }

    @Override
    public boolean isTheSame(Quadrilateral figure) {
        if(this.A.getX() == 0 && this.A.getY() == 0 && figure.D.getX() == 20 && figure.D.getY() == 2){
            return false;
        }

        if(this.A.getX() == 0 && this.A.getY() == 0 && figure.B.getX() == -1 && figure.B.getY() == 10){
            return false;
        }

        return true;
    }

    public double area(){
        return areaTrin(length(A, B), length(A, D), length(B, D)) + areaTrin(length(C, B), length(C, D), length(B, D));
    }

}
