package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// Дана последовательность слов (количество, а затем и сами слова, каждое слово с новой строки).
// Вывести все самые короткие слова через пробел.
// Оценить временную и пространственную сложность алгоритма.
public class Task2 {
  public static void main(String[] args) throws IOException {        // O(n) - time, O(n) - space
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    List<String> worts = new ArrayList<>();                          // O(n) - time, O(n) - space
    System.out.print("Введите количество чисел: слов ");
    int n = Integer.parseInt(br.readLine());                          // O(1) - time, O(1) - space

    System.out.println("Введите " + n + " слов, каждое с новой строки:");
    worts.add(br.readLine());
    int min = worts.get(0).length();                                 // O(1) - time, O(1) - space
    for (int i = 1; i < n; ++i) {                                    // O(n) - time, O(1) - space
      worts.add(br.readLine());                                      // O(1) - time, O(1) - space
      if (worts.get(i).length() < min) {                             // O(1) - time, O(1) - space
        min = worts.get(i).length();
      }
    }
    for (String wort : worts) {                                      // O(n) - time, O(1) - space
      if (wort.length() == min) {                                    // O(1) - time, O(1) - space
        System.out.println(wort);
      }
    }
  }
}
