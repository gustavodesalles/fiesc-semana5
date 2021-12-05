package pacote1;

public class Ex10 {
    int x = 10;

    class ClasseInterna {
        int y = 5;
    }

    static class StatInter {
        static void mensagem() {
            System.out.println("Kilroy was here");
        }
    }

    public static void main(String[] args) {
        Ex10 ex10 = new Ex10();
        Ex10.ClasseInterna classeInterna = ex10.new ClasseInterna();
        System.out.println(ex10.x * classeInterna.y);
        StatInter.mensagem();
    }

}
