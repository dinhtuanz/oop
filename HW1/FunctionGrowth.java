public class FunctionGrowth {
    public static void main(String[] args) {
    
        System.out.println("log n \tn \tn log n\tn^2 \tn^3\t2^n");
        for (long i = 2; i <= 2048; i *= 2) {
            System.out.print((int) Math.log(i));
            System.out.print('\t');             
            System.out.print(i);
            System.out.print('\t');
            System.out.print((int) (i * Math.log(i)));
            System.out.print('\t');
            System.out.print(i * i);
            System.out.print('\t');
            System.out.print(i * i * i);
            System.out.print('\t');
            long n = i ;
            String num = "1";
                for( int j = 1 ; j <= i ; j++) {
                    num=mu(num);
                }
            System.out.println(num);
            System.out.println();
        }
    }
    public static String mu( String a) {
        StringBuilder b = new StringBuilder();
        int nho = 0 ;
        for( int i = a.length()-1 ; i>=0 ;i--)
        {
            int c = (a.charAt(i) - '0') * 2 + nho;
            b.append(c%10);
            nho=c/10;

        }
        if(nho == 1 ) { b.append(nho);}

        return b.reverse().toString();
    }
}
