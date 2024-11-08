import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> words1 = new ArrayList<String>(Arrays.asList("an", "band", "band", "abandon"));
        WordChecker check1 = new WordChecker(words1);
        
        ArrayList<String> words2 = new ArrayList<String>(Arrays.asList("to", "too", "stool", "tools"));
        WordChecker check2 = new WordChecker(words2);

        ArrayList<String> words3 = new ArrayList<String>(Arrays.asList("catch", "bobcat", "catchacat", "cat", "rat"));
        WordChecker check3 = new WordChecker(words3);



        System.out.println(check1.isWordChain());
        System.out.println(check2.isWordChain());
        System.out.println(check3.createList("cat"));
        System.out.println(check3.createList("catch"));
        System.out.println(check3.createList("dog"));
    }
    
    
    
}



























    
