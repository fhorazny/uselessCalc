package com.redhat.fhorazny.first;

public class Addition extends Expression {

    public Addition(double op1, double op2){
        super(op1, op2);
    }

    public Addition(double op1){
        super(op1,0);
    }

    @Override
    public double evaluate() {
        return op1 + op2;
    }

    @Override
    public double evaluate(Expression e) {
        return this.evaluate() + e.evaluate();
    }
}


