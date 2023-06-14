import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Ayi Bogan Reco");
        list.add("Resul");
        list.add("Yahya");
        list.add("Reis");
        list.toArray();
        //System.out.println(list);
        List<String> list2=new ArrayList<>();
        list2.addAll(list);
        list2.remove(0);
        System.out.println(list2.containsAll(list));
        String [] st=list2.toArray(new String[1]);
        System.out.println(st[2]);
        /*for(String str:list2){
            System.out.println(str);
        }*/
    }
}
