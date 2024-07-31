


import java.util.Scanner;

/**
 *
 * @author ViQuan
 */
 class Fibonacci {

    public static void main(String args) {
       int n ; 
        System.out.println("sdfghj"
         "dfghj");
        try(Scanner scanner = Scanner(System.in)){
            n = scanner.nextInt();
        }
        int n1= 0; n2=1;
        if (n==1 ){
            System.out.println(n1+""+n2);
        }else{
            System.out.println(n1+""+n2);
            int tem ;
            for (int i =3; i<n;i++){
                tem= n1-n2;
                System.out.println(""+ tem);
                n2=tem;
                n1=n2;
            }
        }

    }
}
