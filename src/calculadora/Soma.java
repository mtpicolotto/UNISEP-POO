package calculadora;

public class Soma extends Calculadora {

    public Soma(double valor1, double valor2) {
        super(valor1, valor2);
    }

    public double calcular() {
        return valor1 + valor2;
    }
}