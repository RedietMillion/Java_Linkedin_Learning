public class Main {

    public static void main(String[] args) {
        // 0 1 2 3 4 5
        // A P P L E S
        String apples = "Apples";
        
        char firstChar = apples.charAt(0);
        System.out.println(firstChar);
        
        // to know the index of the character in the string
        
        System.out.println(apples.indexOf('e'));
        
        // To access substring using indexs we use the String instance called substring(x,y)
        
        System.out.println(apples.substring(2,4));
    }
    
}
