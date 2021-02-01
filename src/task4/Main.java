package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pro = 1111;
        int expert = 2222;

        System.out.print("Введите ключ версий Pro или Expert: ");

        Scanner in = new Scanner(System.in);
        int kod = in.nextInt();
        if (kod == pro) {
            System.out.println("Про версия программы.");
            ProDocumentWorker proVer = new ProDocumentWorker();
            proVer.openDocument();
            proVer.editDocument();
            proVer.saveDocument();
        } else if (kod == expert) {
            System.out.println("Эксперт версия программы.");
                ExpertDocumentWorker expertVer = new ExpertDocumentWorker();
                expertVer.openDocument();
                expertVer.editDocument();
                expertVer.saveDocument();
        } else {
            System.out.println("Бесплатная версия программы.");
            DocumentWorker baseVer = new DocumentWorker();
            baseVer.openDocument();
            baseVer.editDocument();
            baseVer.saveDocument();
        }
    }
}
