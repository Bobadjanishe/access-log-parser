import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fileCounter = 0;
        while (true) {
            System.out.println("Введите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);
            boolean fileExist = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExist) {
                System.out.println("Файл не сущетсвует, попробуйте снова");
                continue;
            }
            if (isDirectory) {
                System.out.println("Указанный путь ведет к папке, а не к файлу, попробуйте снова");
                continue;
            }
            fileCounter++;
            System.out.println("Путь указан верно.");
            System.out.println("Это файл №: "+ fileCounter);
        }

    }

}
