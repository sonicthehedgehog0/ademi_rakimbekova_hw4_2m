import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namesA = new ArrayList<>();
        ArrayList<String> namesB = new ArrayList<>();
        ArrayList<String> namesC = new ArrayList<>();
        System.out.println("Введите 5 имен для списка А");

        for (int i = 0; i < 5; i++) {
            String element = scanner.next();
            namesA.add(element);
        }
        System.out.println("NamesA: " + namesA);

        System.out.println("Введите 5 имен для списка В");

        for (int j = 0; j < 5; j++) {
            String element = scanner.next();
            namesB.add(element);
        }
        System.out.println("NamesB: " + namesB);
        namesC.addAll(namesA);
        namesC.add(1,namesB.get(4));
        namesC.add(3,namesB.get(3));
        namesC.add(5,namesB.get(2));
        namesC.add(7,namesB.get(1));
        namesC.add(9,namesB.get(0));
        System.out.println("NamesC: " + namesC);
        Collections.sort(namesC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();}
        });
        System.out.println("NamesC: " + namesC);


    }
}