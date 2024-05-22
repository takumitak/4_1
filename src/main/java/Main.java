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
          System.out.println("Podaj imię, nazwisko, wiek studenta, data urodzenia(dzeń, miesiąc, rok)");
          System.out.println("Podaj imię:)");
          String name = scanner.next();
          System.out.println("Podaj nazwisko:");
          String nazwisko = scanner.next();
          System.out.println("Podaj wiek studenta");
          int age = scanner.nextInt();
          System.out.println("Podaj data urodzenia, dzeń");
          int dzienur = scanner.nextInt();
          if(dzienur>31||dzienur<1)
          {
            System.out.println("Niepoprawna data, podaj ponownie dzień");
            dzienur = scanner.nextInt();
          }
          System.out.println("Podaj data urodzenia, miesiąc");
          int miesiacur = scanner.nextInt();
          if(miesiacur>12||miesiacur<1)
          {
            System.out.println("Niepoprawna data, podaj ponownie miesiąc");
            miesiacur = scanner.nextInt();
          }
          System.out.println("Podaj data urodzenia, rok");
          int rokur = scanner.nextInt();
          if(rokur>2021||rokur<1900)
          {
            System.out.println("Niepoprawna data, podaj ponownie rok");
            rokur = scanner.nextInt();
          }
          s.addStudent(new Student(name, nazwisko, age, dzienur, miesiacur, rokur));
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