package com.redhat.fhorazny.first;

public class Multiplication extends Expression {

    public Multiplication(double op1, double op2){
        super(op1, op2);
    }

    public Multiplication(double op1){
        super(1,op1);
    }

    @Override
    public double evaluate() {
        return op1 * op2;
    }

    @Override
    public double evaluate(Expression e) {
        return this.evaluate() * e.evaluate();
    }
}
