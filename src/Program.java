import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        // Informa o caminho do arquivo
        String path = "/Users/lhserafim/Desktop/out.txt";
        String[] lines  = new String[] {"LINHA 1", "LINHA 2", "LINHA 3"};

        Scanner sc = new Scanner(System.in);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) { //se usar o TRUE ele adiciona linhas new FileWriter(path,true)
            System.out.print("Digite a primeira linha: ");
            bw.write(sc.nextLine());
            System.out.print("Deseja adicionar mais uma linha (y/n)? ");
            char ch = sc.next().charAt(0);
            while (ch == 'y') {
                sc.nextLine(); // come a quebra pendente
                bw.newLine();
                bw.write(sc.nextLine());
                System.out.print("Deseja adicionar mais uma linha (y/n)? ");
                ch = sc.next().charAt(0);
            }

            //Vou ler meu vetor
            //for (String c : lines) {
            //    bw.write(c);
            //    bw.newLine();
            //}
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Arquivo gerado!");
        }
    }
}
