package org.jsantos.poosobrecarga;



public class Calculadora {


    private Calculadora() {
    }

    public static int sumar (int a, int b){
        return a + b;
    }


    public static int sumar(int...argumentos){
        int total = 0;
        for (int i = 0; i < argumentos.length ; i++) {
            total+=i;
        }
        return total;
    }


    public static float sumar(float a,int...argumentos){
        float total = 0;
        for (int i:argumentos) {
            total+=i;
        }
        return total;
    }

    public static double sumar(double a,int...varargs){
        double total = 0.0;
        for (int i = 0; i < varargs.length ; i++) {
            total+=i;
        }
        return total;
    }

    public static float sumar(float x, int y){
        return x+y;
    }

    public static float sumar (int i, float j){
        return i+j;
    }

    public static int sumar(String a, String b){
        int resultado;
        try{
            resultado = Integer.parseInt(a)+ Integer.parseInt(b);
        }catch (NumberFormatException e){
            resultado = 0;
        }
        return resultado;
    }
}
