package hashset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    
    public static void main(String[] args) {
        HashMap<String, String> mymap = new HashMap();
        mymap.put("username", "John");
        mymap.put("Tel", "12345");
        System.out.println(mymap.get("username"));
        System.out.println(mymap.get("Tel"));
        
        ArrayList<Map<String, String>> mylist = new ArrayList();
        HashMap<String, String> m1 = new HashMap();
        m1.put("city", "台北");
        m1.put("code", "02");
        mylist.add(m1);
        HashMap<String, String> m2 = new HashMap();
        m2.put("city", "台中");
        m2.put("code", "04");
        mylist.add(m2);
        HashMap<String, String> m3 = new HashMap();
        m3.put("city", "高雄");
        m3.put("code", "07");
        mylist.add(m3);
        for (Map<String, String> m : mylist) {
            System.out.println(m.get("city") + "," + m.get("code"));
        }
    }
}
