import java.util.HashMap;
import java.util.Map;

public class repoForFifty {
    public static void main(String[] args) {

        String stringy = "jjjsuhrjrsjrjarjtkrthjaerth456872yv98tyw398t230-jmtc097  !~ 0T7UY908TYV0WA=TY4=23itquy0ueygi8h9q8ag44362136436jerajjjk";
        Map<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0;i<127;i++){
            char c = (char)i;
            hashMap.put( c, 0);
        }
        //Sets the keys to each ASCII symbol and their values to 0
        for (int i = 0; i < stringy.length(); i++) {
            char c = stringy.charAt(i);
            if(hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }
        //Prints all the keys which were found inside the string
        System.out.println("\nHashMap entries:");
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue()>0){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
