package mar8;

public class StringMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Pragra");
        System.out.println(sb);
        System.out.println(sb.length());
        StringBuffer newsb = sb.append(" incorporation");

        System.out.println(newsb);
        System.out.println(sb.length());
        // String cannot be changed
        System.out.println("--------");

        String s = "Microsoft";
        System.out.println(s);
        String newsbb = s.concat(" Microsoft Incorporation");
        System.out.println(newsbb);
        System.out.println(s);


    }
}
