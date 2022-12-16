import java.util.ArrayList;
import java.util.List;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class homework3_2 {
    public static void main(String[] args) {
        List<Integer> listik = new ArrayList<>();
        
            listik.add(1);
            listik.add(2);
            listik.add(3);
            listik.add(4);
            listik.add(5);
            listik.add(6);
            listik.add(7);
            listik.add(8);

           for (int i = 0; i < listik.size(); i++) {
                if (listik.get(i)%2 == 0){
                    listik.remove(i);
                }
           }
        
        for (Integer integer : listik) {
            System.out.println(integer);
        }
    }

}