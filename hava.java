import java.util.Scanner;

public class hava {
    public static void main(String[] args) {
        int heat;

    Scanner input = new Scanner(System.in);
    System.out.print("Sıcaklık değerini Giriniz: ");
    heat = input.nextInt();

    if (heat <5){
        System.out.println("Kayak yapmaya gidebilirsiniz");
    } else if (( heat>5) && (heat<15)) {
        System.out.println("Sinemaya Gidebilirsiniz");
     } else if ((heat>15) && (heat<25)) {
        System.out.println("Pikniğe Gidebilirsiniz");
    } else  {
       System.out.println("Yüzmeye gidebilirsiniz");
    }
    }
}
