import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]  madhav = new String[3];
        String[] nitin = new String[3];
        try{
            for(int i=0;i<3;i++){
                madhav[i] = sc.next();
                nitin[i] = sc.next();
            }
            for(int i=0;i<3;i++){
                Integer.parseInt(madhav[i]);
                Integer.parseInt(nitin[i]);
            }

        }
        catch(NumberFormatException e){
            System.out.println("its not String");
        }
    }
}
