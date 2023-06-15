package works;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class task {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 21, 4, 23, 4, 2, 5, 25, 6, 43, 12);
        System.out.println(list);
        System.out.println("максимальное число в списке = " + Maximum(list));
        System.out.println("минимальное число в списке = " + Minimum(list));
        System.out.println("среднее число в списке = " + MiddleValue(list));
        System.out.println("список с удалёнными чётными числами: " + DelEvenNum(list));

    }

    public static int Maximum(List<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static int Minimum(List<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }
    public static int MiddleValue(List <Integer> list) {
        int sumvalue = 0;
        for (int i = 0; i < list.size(); i++){
            sumvalue += list.get(i);
        }
        return sumvalue;
    }
    public static List<Integer> DelEvenNum(List<Integer> list) {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i)%2 == 0){
                list.remove(list.get(i));
            }
        }
        return list;
    }
}
