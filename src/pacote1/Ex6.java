package pacote1;

abstract class ClasseAbs {
    public void metodo() {
        System.out.println("Hello");
    }
}

public class Ex6 {
    public static void main(String[] args) {
        ClasseAbs obj = new ClasseAbs() {
            @Override
            public void metodo() {
                System.out.println("Hi!");
            }
        };
        obj.metodo();
    }
}