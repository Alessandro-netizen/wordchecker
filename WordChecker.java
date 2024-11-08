import java.util.ArrayList;

public class WordChecker {
        private ArrayList<String> wordList = new ArrayList<>();
        public WordChecker(ArrayList<String> list)
        {
                wordList = list;
        }
        public boolean isWordChain()
        {
                for(int i = 0; i < (wordList.size()-1); i++) {
                        if( !(wordList.get(i+1).contains(wordList.get(i)))) { 
                                return false;
                        }
                }
                return true;
        }       
        

        public ArrayList<String> createList(String target) {
                
                ArrayList<String> resultList = new ArrayList<String>();


                for(int i = 0; i < wordList.size(); i++) {

                        if (wordList.get(i).length() >= target.length()) {

                                if (wordList.get(i).substring(0, target.length()).equals(target)) { 

                                        resultList.add(wordList.get(i).substring(target.length(), wordList.get(i).length()));
                                }
                        }
                        
                  }
                return resultList;
        }               

       
        

        
}
