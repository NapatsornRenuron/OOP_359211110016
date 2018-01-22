package ooplab6;
    import java.util.StringTokenizer;

    public class myStrToken {
        public static void main(String[] args) {
//        StringTokenizer
            String msg = "Welcome to RMUTSV";
            StringTokenizer myToken = new StringTokenizer(msg);
            System.out.println(myToken.countTokens());

            while (myToken.hasMoreElements()){
                StringBuffer myBuff = new StringBuffer(myToken.nextToken());
                System.out.print(myBuff.reverse()+" ");
            }


        }//main
    }//class

