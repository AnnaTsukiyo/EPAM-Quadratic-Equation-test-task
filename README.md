# Test Quadratic Equation

This exercise is about getting familiar with parametrized unit testing and JUnit 4.12 approach in particular.

Design and code a `solve` method in the [QuadraticEquation](src/main/java/com/epam/rd/autotasks/QuadraticEquation.java) class.
Here are some details:
- The method must solve a quadratic equation specified by the three coefficients given as parameters: a,b,c.
- The first parameter can’t be zero. If it is the case, throw an IllegalArgumentException.
- The `solve` method return a string in one out of three formats:
    - `x1 x2` (two roots in any order separated by space) if there are two roots,
    - `x1` (just the value of the root) if there is the only root,
    - `no roots` (just a string value "no roots") if there is no root.

Complete the test classes:
- [QuadraticEquationNoRootsCasesTesting](src/main/java/com/epam/rd/autotasks/QuadraticEquationNoRootsCasesTesting.java)
- [QuadraticEquationSingleRootCasesTesting](src/main/java/com/epam/rd/autotasks/QuadraticEquationSingleRootCasesTesting.java)
- [QuadraticEquationTwoRootsCasesTesting](src/main/java/com/epam/rd/autotasks/QuadraticEquationTwoRootsCasesTesting.java)
- [QuadraticEquationZeroACasesTesting](src/main/java/com/epam/rd/autotasks/QuadraticEquationZeroACasesTesting.java)

Please consider that these are parameterized test classes.
You must provide at least 4 test cases for each class.
You are not allowed to change the signature of class constructors.

To pass the exercise, your tests must correctly detect flaws of some other sorting method implementations.
There are special tests in several classes that apply your tests to your implementation and other problematic (“bad”) ones.
Your solution method must pass your tests while other implementations must fail your tests in some cases.

There are special tests in several classes that applies your tests to your and some of such bad implementations:
- [DefaultQuadraticEquationTestingTest](src/test/java/com/epam/rd/autotasks/DefaultQuadraticEquationTestingTest.java)
- [ParamCarefulIncapableQuadraticEquationTestingTest](src/test/java/com/epam/rd/autotasks/ParamCarefulIncapableQuadraticEquationTestingTest.java)
- [ParamCarefulTwoRootsReversedOrderQuadraticEquationTestingTest](src/test/java/com/epam/rd/autotasks/ParamCarefulTwoRootsReversedOrderQuadraticEquationTestingTest.java)
- [ParamCarelessSingleRootOnlyQuadraticEquationTestingTest](src/test/java/com/epam/rd/autotasks/ParamCarelessSingleRootOnlyQuadraticEquationTestingTest.java)
- [ParamCarelessTwoRootsOnlyQuadraticEquationTestingTest](src/test/java/com/epam/rd/autotasks/ParamCarelessTwoRootsOnlyQuadraticEquationTestingTest.java)

Hint: [Quadratic formula reference](https://en.wikipedia.org/wiki/Quadratic_formula)