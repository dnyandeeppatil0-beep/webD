
// import java.util.*;

// class index {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();





//         HOLLOW DIAMOND PATTERN
//         int nst = 1;
//         int nsp = n - 1;
//         int nsp2 = -1;
//         for (int i = 1; i <= 2 * n - 1; i++) {
//             for (int m=1 ; m<=nst ; m++){
//                 for (int j = 1; j <= nsp; j++) {
//                 System.out.print(" ");
//             }
//              if (nsp2>0){
//                 for (int k=1 ; k<=nst ; k++){
//                 System.out.print("*");
//             }
//              }
//             for (int j = 1; j <= nsp2; j++) {
//                 System.out.print(" ");
//             }
//             for (int k=1 ; k<=nst ; k++){
//                 System.out.print("*");
//             }
            
//             System.out.println();
//             if(i<=n-1){
//                 nst = 1;
//             nsp--;
//             nsp2+=2;

//             }
//             else{
//                 nst = 1;
//                 nsp++;
//                 nsp2-=2;
//             }
                
//         }
//     }

//     }
// }


import java.util.*;

class index {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String al = scn.next();
        
    if (al.equals("a") || al.equals("e") || al.equals("i") || al.equals("o") || al.equals("u") || al.equals("A") || al.equals("E") || al.equals("I") || al.equals("O") || al.equals("U")){
        System.out.print("Vowels");
    }
    else{
       System.out.print("consonants"); 
    }




    }
}
