package chapter2;

import java.util.ArrayList;
import java.util.List;

public class filterGreenApples {
    // 초록색 사과만 담기
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<Apple>();
        for(Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
}
