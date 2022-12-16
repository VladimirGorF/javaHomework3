import java.util.ArrayList;
import java.util.Collections;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class homework3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> listik = new ArrayList<>();
        
            listik.add(1);
            listik.add(2);
            listik.add(3);
            listik.add(4);
            listik.add(5);
            listik.add(6);
            listik.add(7);
            listik.add(8);

            System.out.println(Collections.min(listik));
            System.out.println(Collections.max(listik));
            
            double sum = 0;
            for (Integer integer : listik) {
                sum += integer;
            }
            double avg = sum/listik.size();
            System.out.println(avg);     
    }
}
