package es.iescuravalera;

public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma() {
        int resul =  num1 + num2;
        return resul;
    }
    public int resta() {
        int resul;
        if (resta2())
            resul= num1 - num2;
        else
            resul = num2 - num1;
        return resul;
    }
    public boolean resta2() {
        return num1>=num2;
    }
    public int multiplica() {
        int resul = num1 * num2;
        return resul;
    }
    public int divide() {
        int resul = num1 / num2;
        return resul;
    }
    public int divide0() {
        if(num2 == 0)
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int resul= num1 / num2;
            return resul;
        }
    }

}
