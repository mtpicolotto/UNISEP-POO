package calculadora;

public class Divisao extends Calculadora {

    public Divisao(double valor1, double valor2) {
        super(valor1, valor2);
    }

    public double calcular() {
        if (valor2 == 0) {
            throw new IllegalArgumentException(
                "Nao e possivel dividir por zero."
            );
        }

        return valor1 / valor2;
    }
}