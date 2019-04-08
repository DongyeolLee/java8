package chapter2;

import java.util.ArrayList;
import java.util.List;

public class filterApplesByColor {
    // 지정된 색의 사과만 담기
    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<Apple>();
        for(Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }
}
