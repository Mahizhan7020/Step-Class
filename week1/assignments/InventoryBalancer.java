public class InventoryBalancer {
    static void analyzeInventory(int[] sectionA,int[] sectionB){
        int sumA=0,sumB=0,max=0;String section="";int index=-1;
        for(int i=0;i<sectionA.length;i++){
            sumA+=sectionA[i];
            if(sectionA[i]>max){max=sectionA[i];section="Section A";index=i+1;}
        }
        for(int i=0;i<sectionB.length;i++){
            sumB+=sectionB[i];
            if(sectionB[i]>max){max=sectionB[i];section="Section B";index=i+1;}
        }
        String status=(sumA==sumB)?"Balanced":"Not Balanced";
        System.out.printf("Section A Total: %d | Section B Total: %d | Status: %s | Highest Quantity: %d (%s, Item %d)\n",
            sumA,sumB,status,max,section,index);
    }
    public static void main(String[] args){
        int[] A={20,15,30},B={25,10,30};
        analyzeInventory(A,B);
    }
}
