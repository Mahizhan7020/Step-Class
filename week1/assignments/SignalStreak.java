public class SignalStreak {
    static void findLongestStreak(String signalLog){
        int maxLen=1,currLen=1;
        char maxChar=signalLog.charAt(0);
        for(int i=1;i<signalLog.length();i++){
            if(signalLog.charAt(i)==signalLog.charAt(i-1)) currLen++;
            else currLen=1;
            if(currLen>maxLen){
                maxLen=currLen;
                maxChar=signalLog.charAt(i);
            }
        }
        System.out.println("Longest Streak: '"+maxChar+"' repeated "+maxLen+" times");
    }
    public static void main(String[] args){
        findLongestStreak("RRGGGYRR");
    }
}
