import java.util.Scanner;
import java.util.HashMap;


     public class Word {
    public  static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        HashMap<String, Integer> h = new HashMap<>();

        System.out.println("Enter a sentence");

          String s=sc.nextLine();
        String[] words = s.split(" ");

        for (String word : words) {
            if (h.containsKey(word))
                h.put(word, h.get(word) + 1);

            else
                h.put(word, 1);

        }

        System.out.println(h);
    }
}
