import java.util.HashMap;

public class HashMapBasic {

    public static void main(String[] args) {
        HashMap<String, Integer> wordToNum = new HashMap();

        // Insert key-and-value pairs into the Hashmap
        wordToNum.put("ONE", 1);
        wordToNum.put("TWO",2);
        wordToNum.put("THREE",3);
        wordToNum.put("FOUR", 4);
        wordToNum.put("FIVE", 5);

        //to retrieve a value use the key with the .get method
        System.out.println(wordToNum.get("THREE"));

        //can also list out all the values and keys
        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());

        //to remove elements
        System.out.println(wordToNum.remove("FOUR"));
    }

}
