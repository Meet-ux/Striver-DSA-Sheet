import java.util.ArrayList;
import java.util.Collections;

public class jcollection{
    public static void main(String[] args) {
        ArrayList<Integer> list1 =  new ArrayList<Integer>();
        list1.add(5);
        list1.add(3);
        list1.add(2);
        list1.add(3);
        System.out.println(list1.get(0));
        System.out.println(list1);
        list1.add(2, 10);
        System.out.println(list1);
        list1.set(3, 15);
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);
        list1.size();
        System.out.println(list1.size());

        Collections.sort(list1);
        System.out.println(list1);

    }
}