package Task2;

import java.io.*;
import java.util.Scanner;

public class main {

    public static void inputFile(File file) {
        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write("Привет, я строка!\nПривет,"
                    + " я вторая строка\nПривет, я третья строка");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static String searchInFile(File file) {
        int wordNum = 0;
        int lineNum = 0;
        String symbolNum = "";

        try (FileReader fileReader = new FileReader(file)) {
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

            Scanner in = new Scanner(file);
            while (in.hasNext()) {
                symbolNum += in.nextLine() + "\r\n";
            }

            while (lineNumberReader.readLine() != null) {
                lineNum++;
            }

            in = new Scanner(new FileInputStream(file));
            while (in.hasNext()) {
                in.next();
                wordNum++;
            }
            lineNumberReader.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        return "Кол-во строк: " + lineNum + "\nКол-во слов: "
                + wordNum + "\nКол-во символов: " + symbolNum.length();
    }

    public static void main(String[] args) {
        File file = new File("src/Task2/text.txt");
        inputFile(file);
        System.out.println(searchInFile(file));
    }
}
