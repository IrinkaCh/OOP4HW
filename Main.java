import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IsEven<Integer> isEven = new IsEven<>();
        System.out.println(isEven.isGood(4));

        IsPositive<Integer> isPositive = new IsPositive<>();
        System.out.println(isPositive.isGood(1));

        BeginsWitha<String, Character> beginsWitha = new BeginsWitha<String, Character>('А');
        System.out.println(beginsWitha.isGood("Аквамарин"));

        BeginsWith<String> beginsWith = new BeginsWith<>("Аква");
        System.out.println(beginsWith.isGood("Аквамарин"));

        List<Integer> lst = new ArrayList<>();
        lst.add(-5);
        lst.add(4);
        lst.add(-1);
        lst.add(9);
        lst.add(-7);
        lst.add(1);
        lst.add(3);
        lst.add(-3);

        Filter<Integer> f = new Filter<>();
        System.out.println(f.filter(lst));
    }
}