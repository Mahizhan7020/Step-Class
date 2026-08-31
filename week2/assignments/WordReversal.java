public class WordReversal {
    static String reverseEachWord(String sentence){
        String[] words=sentence.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String w:words){
            sb.append(new StringBuilder(w).reverse()).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args){
        System.out.println(reverseEachWord("hello club"));
    }
}
