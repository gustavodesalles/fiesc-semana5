package pacote1.ex5.p2;

import pacote1.ex5.p3.SegClasse;

public class PrimClasse {
    public int numero;

    public PrimClasse() {
        this.numero = 3;
    }

    public PrimClasse(int numero) {
        this.numero = numero;
    }

    public static int getSquare(int numero) {
        return numero * numero;
    }

    public static void main(String[] args) {
        SegClasse obj = new SegClasse();
        obj.prName();
    }
}
