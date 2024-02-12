package Test.Task_Phone_Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

        if (phoneBook.containsKey(name)) {
            ArrayList<Integer> arrnum = phoneBook.get(name);
            int lenNum = arrnum.size();
            ArrayList<Integer> newArray = arrnum;
            newArray.add(phoneNum);
            phoneBook.replace(name, newArray);

        } else {
            ArrayList<Integer> phoneNumArray = new ArrayList<>();
            phoneNumArray.add(phoneNum);

            phoneBook.put(name, phoneNumArray);
        }

    }
    public void delete(String name) {
        if (phoneBook.containsKey(name)) {
           phoneBook.remove(name);
        }
    }

    public ArrayList<Integer> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else {
            ArrayList<Integer> nulls = new ArrayList<>();
            return nulls;
        }

    }

    public static HashMap<String, ArrayList<Integer>> sortPhone(HashMap<String, ArrayList<Integer>> phoneBook) {
        HashMap<String, ArrayList<Integer>> sortedPhoneBook = new HashMap<>();
        int maxi = 0;
        for (Map.Entry<String, ArrayList<Integer>> entry : phoneBook.entrySet()) {
            String key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            if (value.size() > maxi) {
                maxi = value.size();
            }
        }
        for (int i = 0; i < maxi + 1; i++) {
            for (Map.Entry<String, ArrayList<Integer>> entry : phoneBook.entrySet()) {
                String key = entry.getKey();
                ArrayList<Integer> value = entry.getValue();
                if (value.size() == i) {
                    sortedPhoneBook.put(key,value);
                    System.out.println(key+Arrays.asList(value));

                }

            }

        }
        return sortedPhoneBook;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook(){
        return sortPhone(phoneBook);
    }

}

