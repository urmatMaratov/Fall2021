public class Practice {
    public static void main(String[] args) {
        String str = "Urmat";
        String front = str.substring(0,str.length()-3);
        if(str.length()>2)
            System.out.println(front+ str.substring(str.length()-3).toUpperCase());
        System.out.println(str.substring(str.length()-3));
    }
}
