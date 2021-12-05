package pacote1;

public class Ex9 {
    {
        System.out.println("dentro do bloco de instância");
    }

    static {
        System.out.println("dentro do bloco static");
    }

    public Ex9() {
        System.out.println("dentro do construtor");
    }

    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();
    }
}
