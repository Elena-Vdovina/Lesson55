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
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    List<String> worts = new ArrayList<>();
    System.out.print("Введите количество чисел: слов ");
    int n = Integer.parseInt(br.readLine());

    System.out.println("Введите " + n + " слов, каждое с новой строки:");
    worts.add(br.readLine());
    int min = worts.get(0).length();
    for (int i = 1; i < n; ++i) {
      worts.add(br.readLine());
      if (worts.get(i).length() < min) {
        min = worts.get(i).length();
      }
    }
    for (String wort : worts) {
      if (wort.length() == min) {
        System.out.println(wort);
      }
    }
  }
}
