package pacote1;

public class Ex2 {
    public static class Classe1 {
        int a;

        public Classe1() {
            this(23);
        }

        public Classe1(int x) {
            a = x;
        }
    }

    public static void main(String[] args) {
        Classe1 classe1 = new Classe1(42);
        System.out.println(classe1.a);

        Classe1 c2 = new Classe1();
        System.out.println(c2.a);
    }
}