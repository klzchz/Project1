package cursodoita;

import javax.swing.JOptionPane;

public class Carro {

    int potencia;
    int velocidade;
    String nome;

    void acelerar() {
        velocidade += potencia;
    }

    void frear() {
        velocidade = velocidade / 2;
    }

    int getVelocidade() {
        return velocidade;
    }

    void imprimir() {
        JOptionPane.showMessageDialog(null, "O Carro " + nome + " está à " + getVelocidade() + " KM/h ", "Informativo", 1);

    }

}
