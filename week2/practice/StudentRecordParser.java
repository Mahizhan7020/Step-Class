public class StudentRecordParser {
    static void parseStudentRecord(String csvLine){
        String[] parts=csvLine.split(",");
        if(parts.length!=3) System.out.println("Invalid Record");
        else System.out.println("Name: "+parts[0]+" | Roll No: "+parts[1]+" | Dept: "+parts[2]);
    }
    public static void main(String[] args){
        parseStudentRecord("Ananya Verma,RA2211003010123,CSE");
        parseStudentRecord("Ananya Verma,CSE");
    }
}
