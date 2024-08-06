public class Strng {
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(1));
        System.out.println(sb.charAt(2));
        System.out.println(sb.charAt(3));
    
        //set character at particular index i.e. the original char will be replaced by new char

        sb.setCharAt(2, 'x');
        System.out.println(sb);
        sb.setCharAt(2,'n');
        System.out.println(sb);

        // insert a char in starting

        sb.insert(0,'s');
        System.out.println(sb);

        //delete a char from any index

        sb.delete(0,1); // ending index will not be counted 
        System.out.println(sb);

        // appending char at last
        sb.append(' ');
        sb.append('S');
        sb.append('t');
        sb.append('a');
        sb.append('r');
        sb.append('k');
        System.out.println(sb);
        

    }
}
