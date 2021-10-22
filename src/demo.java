public class demo {
    public static void main(String[] args)
    {

        String name = "Nancy"; // string literal
        String name1= new String("Nancy");
        String s1 ="java";
        String s2 ="java";
        System.out.println(s1==s2);
       // ^ same as above System.out.println(s1.equals(s2));
        String s3 = new String("java");
        System.out.println(s1==s3);
        System.out.println("My new changes");
    }
}
