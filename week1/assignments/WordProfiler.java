public class WordProfiler {
    static void classifyWordLengths(String review){
        String[] words=review.split("\\W+");
        int shortCount=0,mediumCount=0,longCount=0;
        for(String w:words){
            if(w.length()>=1 && w.length()<=4) shortCount++;
            else if(w.length()>=5 && w.length()<=8) mediumCount++;
            else if(w.length()>=9) longCount++;
        }
        System.out.printf("Short: %d | Medium: %d | Long: %d\n",shortCount,mediumCount,longCount);
    }
    public static void main(String[] args){
        classifyWordLengths("This movie was absolutely fantastic and thrilling");
    }
}
