public class logical{
    public static void main(String args[])
    {
        int a=10;
        int b=5;
        System.out.println((a>b)&&(b<a));
        System.out.println((a>b)&&(b>a));
        System.out.println((a>b)||(b<a));
        System.out.println((a<b)||(b>a));
        System.out.println(!((a>b)&&(b<a)));
    }
}