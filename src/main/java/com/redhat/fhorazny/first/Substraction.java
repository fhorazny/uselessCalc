package com.redhat.fhorazny.first;

public class Substraction extends Expression {

    public Substraction(double op1, double op2){
        super(op1, op2);
    }

    public Substraction(double op1){
        super(0,op1);
    }

    @Override
    public double evaluate() {
        return op1 - op2;
    }

    @Override
    public double evaluate(Expression e) {
        return this.evaluate() - e.evaluate();
    }
}
