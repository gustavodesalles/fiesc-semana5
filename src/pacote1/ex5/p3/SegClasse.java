package pacote1.ex5.p3;

import pacote1.ex5.p2.PrimClasse;

public class SegClasse {
    String nome;

    public SegClasse() {
        this.nome = "Gustavo";
    }

    public SegClasse(String nome) {
        this.nome = nome;
    }

    public void prName() {
        System.out.println("Your name is "+nome);
        return;
    }

    public static void main(String[] args) {
        System.out.println(PrimClasse.getSquare(3));
    }
}
