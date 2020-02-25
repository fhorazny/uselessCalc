package com.redhat.fhorazny.first;

public class Division extends Expression {

    public Division(double op1, double op2){
        super(op1, op2);
    }

    public Division(double op1){
        super(op1,1);
    }

    @Override
    public double evaluate() {
        return op1 / op2;
    }

    @Override
    public double evaluate(Expression e) {
        return this.evaluate() / e.evaluate();
    }
}
