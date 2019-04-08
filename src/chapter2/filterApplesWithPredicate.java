package chapter2;

import java.util.ArrayList;
import java.util.List;

public class filterApplesWithPredicate {
    public static List<Apple> filterApplesWithPredicate(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<Apple>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void filterAppleWithAnonymousClass() {
        List<Apple> redApples = filterApplesWithPredicate(new ArrayList<Apple>(), (Apple apple) -> "red".equals(apple.getColor()));
    }
}
