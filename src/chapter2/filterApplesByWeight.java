package chapter2;

import java.util.ArrayList;
import java.util.List;

public class filterApplesByWeight {
    // 특정 무게보다 무거운 사과만 담기
    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<Apple>();
        for(Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }
}
