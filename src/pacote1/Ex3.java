package pacote1;

import java.util.Currency;

import static java.time.LocalDateTime.now;
import static java.util.Currency.getInstance;
import static java.util.Locale.getDefault;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(getInstance("BRL"));
        System.out.println(now());
        System.out.println(getDefault());
    }

}
