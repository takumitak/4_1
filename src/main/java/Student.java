public class Student {

  private String Name;
  private String Nazwisko;
  private int Age;
  private int Dzienur;
  private int Miesiacur;
  private int Rokur;

  public Student(String name, String nazwisko, int age, int dzienur, int miesiacur, int rokur) {
    Name = name;
    Nazwisko = nazwisko;
    Age = age;
    Dzienur = dzienur;
    Miesiacur = miesiacur;
    Rokur = rokur;
  }

  public String GetName() {return Name;}
  public String GetNazwisko() {return Nazwisko;}
  public int GetAge() {return Age;}
  public int GetDzienur() {return Dzienur;}
  public int GetMiesiacur() {return Miesiacur;}
  public int GetRokur() {return Rokur;}
  

  public String ToString() {
    return Name + " "+ Nazwisko + " " + Integer.toString(Age)+ " " + Integer.toString(Dzienur) + "." + Integer.toString(Miesiacur)+ "." + Integer.toString(Rokur);
  }

  public static Student Parse(String str) {
    String[] data = str.split("[ .]");
    if(data.length != 6) 
      return new Student("Parse Error","Nazwisko Error", -1,-2, -3, -4);
    return new Student(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
  }
}