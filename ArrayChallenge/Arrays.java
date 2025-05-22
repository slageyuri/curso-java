package ArrayChallenge;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
            Student[] alugantes = new Student[10];

            System.out.println("Quantos quartos serão alugados");
            int n =0;
            Scanner scan = new Scanner(System.in);
            n= scan.nextInt();

            for(int i=0;i<n;i++){
                System.out.println("Adicione o aluno de número " + (i+1));
                System.out.print("Nome: ");
                String name = scan.next();

                System.out.print("Email: ");
                String email = scan.next();
                alugantes[i]= new Student(name, email);
                System.out.println("Qual quarto esse aluno deseja?");
                alugantes[i].setRent("#"+(i+1));
                alugantes[i].setRoom(scan.nextInt());
            }
            System.out.println("Busy Rooms:");
            for(int i=0;i<10;i++){
                if(alugantes[i]!=null)
                System.out.println(alugantes[i].toString());
                System.out.println();
            }

            scan.close();
    }
}
