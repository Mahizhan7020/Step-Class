import java.util.*;

public class WordFrequency {
    static void printFilteredWordFrequency(String feedback){
        String[] stop={"the","was","and","a","is","of","in"};
        Set<String> stopWords=new HashSet<>(Arrays.asList(stop));
        String clean=feedback.toLowerCase().replace(".","").replace(",","");
        String[] words=clean.split("\\s+");
        Map<String,Integer> freq=new HashMap<>();
        for(String w:words){
            if(!stopWords.contains(w)) freq.put(w,freq.getOrDefault(w,0)+1);
        }
        List<Map.Entry<String,Integer>> list=new ArrayList<>(freq.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<String,Integer> e:list) System.out.println(e.getKey()+": "+e.getValue());
    }
    public static void main(String[] args){
        printFilteredWordFrequency("The mentor was great, the session was great and clear.");
    }
}
