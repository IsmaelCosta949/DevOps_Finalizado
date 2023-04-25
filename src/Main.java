import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String contunuar = "s";
        int count = 0;

        List<Colaboradoes_Parceiros> lista_colaboradores = new ArrayList<Colaboradoes_Parceiros>();

        while (contunuar == "s"){
            count = count+1;
            System.out.println("Insira os dados do convidado N" + count);
            Scanner teste = new Scanner(System.in);
            System.out.println("Insira nome");
            String name = teste.nextLine();
            System.out.println("Insira o CPF");
            long CPF = Long.parseLong(teste.nextLine());
            System.out.println("Insira o telefone");
            long Tel = Long.parseLong(teste.nextLine());
            System.out.println("Insira a Data");
            String Data = teste.nextLine();
            System.out.println("Insira o Periodo");
            String periodo = teste.nextLine();

            System.out.println();
            System.out.println("Informações do convidado" + count);
            Colaboradoes_Parceiros nome = new Colaboradoes_Parceiros(
                    name,
                    CPF,
                    Tel,
                    Data,
                    periodo);

            lista_colaboradores.add(nome);

            count = count+1;
            System.out.println("Deseja continuar?");
            String continu = teste.nextLine();
            contunuar = continu;
        }

        for (int i = 0; i < lista_colaboradores.size(); i++){
            System.out.println(lista_colaboradores.get(i).toString());
        }
    }
}