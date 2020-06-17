


import java.util.Scanner;

class Calculation {
  public static void main(String[] args) {
    int a, b, c; 

    Scanner sc = new Scanner(System.in); 
    System.out.print("Nhập a: ");
    a = sc.nextInt();
    System.out.print("Nhập b: ");
    b = sc.nextInt();
    System.out.print("Nhập c: ");
    c = sc.nextInt();

    if (laTamgiac(a,b,c)){
      System.out.println("Là tam giác!");
      if(laTamgiacDeu(a,b,c)){
        System.out.println("Và còn đều nữa!");
        
      }else {
        if (laTamgiacVuong(a, b, c)) {
          System.out.println("Và còn vuông nữa!");
          
        }
        if (laTamgiacCan(a, b, c)) {
          System.out.println("Và còn cân nữa!");
        }
      }
    }else{
      System.out.println("Không phải là tam giác!");
    }
  }

  public static boolean laTamgiac(int a, int b, int c) {
    if ((a + b) > c && (a + c) > b && (b + c) > a) {

      return true;
    } else {
      return false;
    }
  }

  public static boolean laTamgiacVuong(int a, int b, int c){
    if ((a*b + b*b) == c*c || (a*a + c*c) == b*b || (b*b + c*c) == a*a) {

      return true;
    } else {
      return false;
    }
  }

  public static boolean laTamgiacCan(int a, int b, int c){
    if (a == b || b == c || c == a) {
      return true;
    }else{
      return false;
    }
  }

  public static boolean laTamgiacDeu(int a, int b, int c){
    if (a == b && b == c) {
      return true;
    }else{
      return false;
    }
  }
}