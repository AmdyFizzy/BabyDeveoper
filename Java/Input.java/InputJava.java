import java.util.Scanner;

public class InputJava{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    print("Wanna type something??");

    String typed = sc.next();
    print(typed);
  }

  public void print(String str){
    System.out.println(str);
  }

}
