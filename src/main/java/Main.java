/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner = new Scanner(System.in);
      int w;
      while(true){
      System.out.println("1. Dodaj studenta");
      System.out.println("2. Wypisz wszystkich studentów");
      System.out.println("3. Wyjdź");
      w=scanner.nextInt();
      switch(w)
      {
      case 1:
          System.out.println("Podaj imię, nazwisko, wiek studenta, data urodzenia");
          String name = scanner.next();
          String nazwisko = scanner.next();
          int age = scanner.nextInt();
          String dataur = scanner.next();
          s.addStudent(new Student(name, nazwisko, age, dataur));
          break;
      case 2:
          var students = s.getStudents();
          for(Student current : students)
          {
            System.out.println(current.ToString());
          }
          break;
        case 3:
          return;
      }

      }

    } catch (IOException e) {

    }
  }
}