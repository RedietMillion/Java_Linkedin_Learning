public class Main {

    public static void main(String[] args) {
        String firstName = "Rediet";
        String lastName = "Million";

        String name = firstName + " " + lastName;
        System.out.println(name);
        
        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append("def");
        stringBuffer.append("ghi");
        stringBuffer.insert(0, "xyz");
        stringBuffer.delete(3, 6);
        String beta = stringBuffer.toString();
        System.out.println(beta);
    }
}
