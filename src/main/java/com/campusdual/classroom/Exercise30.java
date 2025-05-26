package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor==0){
            throw new DivisionByZeroException("El resultado de dividir entre 0 es infinito.");
        }
        return dividend/divisor;
    }

    public static void main(String[] args) {
        try {
            System.out.println("El resultado es: " + divisionWithCustomException(1,0));
        }
        catch (DivisionByZeroException e){
            System.out.println(e.getMessage());
        }
    }
}
