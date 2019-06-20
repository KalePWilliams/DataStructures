import java.util.HashMap;

public class HashMapMostRepeatedCharacter {

    public static void main(String[] args) {

        String s = "phonebook";
        // map characters to integers
        HashMap<Character, Integer> hashMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (hashMap.containsKey(currentChar)) {
                // increment current value for this key in hashmap by 1 if it is
                // already there
                hashMap.put(currentChar, hashMap.get(currentChar) + 1);
            } else {
                // If we haven't added it to the hashmap, then put it in with the value
                hashMap.put(currentChar, 1);
            }
        }

        Character mostRepeated = ' ';
        int max = 0;
        for (Character key : hashMap.keySet()) {
            int currentValue = hashMap.get(key);
            if (currentValue > max) {
                mostRepeated = key;
                max = currentValue;
            }
        }

    }
}
