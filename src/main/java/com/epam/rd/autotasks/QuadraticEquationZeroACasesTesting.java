package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class QuadraticEquationZeroACasesTesting {

    private final double a;
    private final double b;
    private final double c;
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    public QuadraticEquationZeroACasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, -7, 12},
                {0, -7, 12},
                {0, -7, 12},
                {0, -7, 12}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoRootsCase() {
        quadraticEquation.solve(a, b, c);
    }

}