package hashset;

import java.util.HashSet;

public class Hashset {

    public static void main(String[] args) {
        HashSet<String> myset = new HashSet<>();
        myset.add("AA");
        myset.add("CC");
        myset.add("BB");
        myset.add("AA");
        for (String s : myset) {
            System.out.println(s);
        }
    }

}
