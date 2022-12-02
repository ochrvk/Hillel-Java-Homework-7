# Hillel-Java-Homework-7

## **Сделанное задание залить на Github**

## **Task 1:**
Создать 2-мерный массив (матрица) M*N и заполнить его случайными числами.   
Отсортировать числа по возрастанию, чтобы с левом верхнем углу было самое маленькое число, справа от него следующее по значению, итд, в правом нижнем углу самое большое.


## **Task 2:**   
Задан текстовый файл. Вывести сколько в нём: a) строк b) слов c) символов


## **Task 3:**   
Есть List объектов у каждого из которых 2 поля: int и String. 
Удалить те у которых значения int повторяются(оставить по одному из дубликатов).


## **Task 4*:**   
Задана строка с датой вида "22.01.2019 19:15:00".   
Написать метод который преобразовывает ее в формат "22 Jan, 7:15 PM".   
Предусмотреть обработку ситуации если входящая дата в недопустимом формате.  


## **Task 5*:**   
Есть фрагмент кода, который при запуске выдает ошибку NullPointerException. Найдите и исправьте ошибку:
```
import java.util.ArrayList;
import java.util.List;

public class Main {
  private static class Ball {
  }

  private static class Board {
    private List balls;

    public Board() {
      List balls = new ArrayList<>();
      balls.add(new Ball());
      balls.add(new Ball());
      balls.add(new Ball());
    }

    public int count() {
      return balls.size();
    }
  }

  public static void main(String[] args) {
    Board board = new Board();
    System.out.println(board.count());
  }
}
```
