package chrvk.javaelementary.hw7.task2;

import java.io.*;
import java.util.Scanner;

//Задан текстовый файл. Вывести сколько в нём: a) строк b) слов c) символов

public class Main {

    public static void inputFile(File file) {
        FileWriter writer;
        try {
            writer = new FileWriter(file, false);
            writer.write("Привет, я строка!\nПривет,"
                    + " я вторая строка\nПривет, я третья строка");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String searchInFile(File file) {
        int wordNum = 0;
        int lineNum = 0;
        StringBuilder symbolNum = new StringBuilder();

        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

            Scanner in = new Scanner(file);
            while (in.hasNext()) {
                symbolNum.append(in.nextLine()).append("\r\n");
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
            e.printStackTrace();
        }

        return "Кол-во строк: " + lineNum + "\nКол-во слов: "
                + wordNum + "\nКол-во символов: " + symbolNum.length();
    }

    public static void main(String[] args) {
        File file = new File("src/chrvk.hw7.Task2/text.txt");
        inputFile(file);
        System.out.println(searchInFile(file));
    }
}
