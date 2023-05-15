package PracticePrograms;

import java.util.HashMap;
import java.util.Map;

public class occuranceWords {

    public static void main(String[] args) {

        String str = "java is a language java is easy java beautiful";
        String[] str1 = str.split(" ");
        Map<String,Integer> hmap = new HashMap<>();

        for (String word: str1) {

            if (hmap.containsKey(word))
            {
                hmap.put(word, hmap.get(word)+1);
            }
            else {
                hmap.put(word,1);
            }

        }
        System.out.println(hmap.get("java"));
    }
}
