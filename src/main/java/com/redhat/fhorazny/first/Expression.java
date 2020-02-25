package com.redhat.fhorazny.first;

public abstract class Expression {


    double op1;
    double op2;

    public Expression(double op1,double op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    public abstract double evaluate();

    public abstract double evaluate(Expression e);
}

///     12-5 vs 5-12 vs 3*7+4 vs 3*(7+4)