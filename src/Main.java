import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        System.out.println("hashset vuoto: " + numbers);
        System.out.println("hashset popolato: " + fill(numbers));
        elements(fill(numbers));
    }

    public static Set <Integer> fill (Set <Integer> list) {
        list = new HashSet<>();
        list.add(3);
        list.add(7);
        list.add(22);
        return list;
    }

    public static void elements(Set <Integer> list){
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()) {
         Integer e = i.next();
           System.out.println("elemento presente nell'hashset: " + e);
        }
    }
}
