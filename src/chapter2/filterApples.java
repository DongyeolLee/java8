package chapter2;

import java.util.ArrayList;
import java.util.List;

public class filterApples {
    // 형편없는 코드, 색이나 무게 중 어떤 것을 기준으로 할지 flag를 둔다
    public static List<Apple> filterApples(List<Apple> inventory, String color, int weight, boolean flag) {
        List<Apple> result = new ArrayList<Apple>();
        for(Apple apple : inventory) {
            if ((flag && apple.getColor().equals(color)) || (!flag && apple.getWeight() > weight)) {
                result.add(apple);
            }
        }
        return result;
    }
}
