package tugas5;
import java.util.Scanner;
import java.util.ArrayList;
public class MainApp {
    public static void main(String[] args) {
        boolean ulang= true;
        int i =1;
        Scanner input = new Scanner(System.in);
        ArrayList <String> daftar = new ArrayList<String>();
        ArrayList<Integer> angka= new ArrayList<Integer>();
        while(ulang){
            angka.add(daftar.size());
            System.out.print(angka.size());
            System.out.print(".Sebutkan nama nama ikan : ");
            daftar.add(input.next());
            System.out.print("Ada lagi ? y/n : ");
            String p = input.next();
            if(p.equalsIgnoreCase("y")){
                ulang=true;
            }else{
                ulang=false;
            }
        }
        for(String namaIkan : daftar){
            System.out.println(i++ +"."+namaIkan);
        }
        System.out.println("Horeeee kamu berhasil menjawab "+  daftar.size() +" nama ikan");
        System.out.println("Kamu dapat sepeda");
    }
}

