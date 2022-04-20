package com.epam.rd.autotasks;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {
        if (a == 0)  {
            throw new IllegalArgumentException();
        }
        double d = Math.pow(b,2) - 4*a*c;
        if (d > 0) {
            double rootOfd = Math.pow(d,0.5);
            double x1 = (-b - rootOfd) / (2*a);
            double x2 = (-b + rootOfd) / (2*a);
            return String.format("%s %s",x1,x2);
        }
        else if (d ==0) {
            double x0 = -b / (2 *a);
            return String.format("%s", x0);

        }
        else {
            return "no roots";
        }
    }

}