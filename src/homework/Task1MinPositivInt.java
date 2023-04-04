package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Найти минимальное чётное число в последовательности положительных чисел или вывести -1,
// если такого числа не существует.
// Оценить временную и пространственную сложность алгоритма.
public class Task1MinPositivInt {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество чисел: ");
    int n = Integer.parseInt(br.readLine());

    System.out.println("Введите " + n + " положительных чисел, каждое с новой строки:");
    int result = -1;
    int min = Integer.parseInt(br.readLine());
    for (int i = 1; i < n; ++i) {
      int x = Integer.parseInt(br.readLine());
      if (x % 2 == 0) {
        if (x < min) {
          min = x;
          result = i;
        }
      }
    }
    if (result < 0) {
      System.out.println("Результат: " + result);
    } else {
      System.out.println("Минимальное чётное число: " + min);
    }
  }
}
