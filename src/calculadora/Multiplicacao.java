package calculadora;

public class Multiplicacao extends Calculadora {

    public Multiplicacao(double valor1, double valor2) {
        super(valor1, valor2);
    }

    public double calcular() {
        return valor1 * valor2;
    }
}