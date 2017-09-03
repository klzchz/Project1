package cursodoita;

public class CursodoITA {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.potencia = 50;
        c1.nome = "Camaro";
        c1.velocidade = 0;

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();

        c1.imprimir();

    }

}
