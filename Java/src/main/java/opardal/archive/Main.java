package opardal.archive;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int x = 22;

        do {

            System.out.println("""
                    +---------------x---------------+
                    [1] Download
                    [2] Upload
                    
                    [0]Sair
                    +---------------x---------------+
                    """);

            System.out.println("Digite seu número de destino: ");

            x = inp.nextInt();

        } while (x < 0 || x > 2);

        if (x == 0) {
            System.out.println("Fechamento Solicitado.");
            System.exit(0);
        }

        if (x == 1) {//Download
            int d = 22;

            do {

                System.out.println("""
                        +---------------x---------------+
                        [1] Directory
                        [2] File
                        
                        [0]Sair
                        +---------------x---------------+
                        """);

                System.out.println("Digite seu número de destino: \n");
                d = inp.nextInt();

            } while (d < 0 || d > 2);
            try {
                ArchCompress.start(d);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        // printf("1%s\n", CHCKS);
    }
}
