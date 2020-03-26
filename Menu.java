import java.io.*;

public class Menu {

        public static  void menu() throws IOException { // menu principal
            DataInputStream io = new DataInputStream(System.in);
            int opcao =0;
            do {
                System.out.println("\n\n - Menu Restaurante -\n\n");
                System.out.println("\n   =========================");
                System.out.println("   |     1 - Nossos pratos     |");
                System.out.println("   |     2 - Pagar             |");
                System.out.println("   |     0 - Sair              |");
                System.out.println("    =========================\n");
                System.out.print("Digite a opção: ");

                opcao = io.readInt();
                System.out.print("\n");
                switch (opcao) {
                    case 1:
                        System.out.println(new NossosPratos());
                        System.out.println();
                        return;
                    case 2:
                        System.out.println(new ValorTotal());
                        return;
                    case 0:
                        break;

                    default:
                        return ;
                }
            } while (opcao != 0);




        }
}
