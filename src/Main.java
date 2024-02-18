import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        String stringy = "aaba111";
        Map<Character, Integer> treeMap = new TreeMap<>();

        //Sets the keys to each ASCII symbol and their values to 0
        for (int i = 0; i < stringy.length(); i++) {
            char c = stringy.charAt(i);
            if(treeMap.containsKey(c)){
                treeMap.put(c, treeMap.get(c) + 1);
            }else{
                treeMap.put(c,1);
            }
        }
        //Prints all the keys which were found inside the string
        System.out.println("\nHashMap entries:");
        for (Map.Entry<Character, Integer> entry : treeMap.entrySet()) {
            if(entry.getValue()>0){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
