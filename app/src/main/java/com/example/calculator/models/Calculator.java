package com.example.calculator.models;

import com.example.calculator.models.interfaces.ICalculate;

public class Calculator implements ICalculate {

    @Override
    public int Add(int... args) {
        int result = 0;
        for (int arg: args) {
            result += arg;
        }

        return result;
    }

    @Override
    public float Add(float... args) {
        float result = 0;
        for (float arg: args){
            result += arg;
        }

        return result;
    }

    @Override
    public float Divide(int... args) {
        float result = args[0];
        for (int i = 1; i < args.length; i++){
            if (args[i] == 0){
                throw new IllegalArgumentException("Cannot be divided by zero");
            }
            result /= args[i];
        }

        return result;
    }

    @Override
    public float Divide(float... args) {
        float result = args[0];
        for (int i = 1; i < args.length; i++){
            if (args[i] == 0.0){
                throw new IllegalArgumentException("Cannot be divided by zero");
            }
            result /= args[i];
        }

        return result;
    }

    @Override
    public int Multiply(int... args) {
        int result = 1;
        for (int arg: args){
            result *= arg;
        }

        return result;
    }

    @Override
    public float Multiply(float... args) {
        float result = 1;
        for (float arg: args){
            result *= arg;
        }

        return result;
    }

    @Override
    public int Subtract(int... args) {
        int result = 0;
        for (int arg: args){
            result -= arg;
        }

        return result;
    }

    @Override
    public float Subtract(float... args) {
        float result = 0;
        for (float arg: args){
            result -= arg;
        }

        return result;
    }
}
