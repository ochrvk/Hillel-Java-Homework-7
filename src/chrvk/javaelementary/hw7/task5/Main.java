package chrvk.javaelementary.hw7.task5;
// Есть фрагмент кода, который при запуске выдает ошибку NullPointerException. Найдите и исправьте ошибку:
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static class Ball {
    }

    private static class Board {
        private final List<Object> balls;

        public Board() {
            this.balls = new ArrayList<>();
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
