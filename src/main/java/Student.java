public class Student {

  private String Name;
  private String Nazwisko;
  private int Age;
  private String DataUr;

  public Student(String name, String nazwisko, int age, String dataur) {
    Name = name;
    Nazwisko = nazwisko;
    Age = age;
    DataUr = dataur;
  }

  public String GetName() {return Name;}
  public String GetNazwisko() {return Nazwisko;}
  public int GetAge() {return Age;}
  public String GetDataUr() {return DataUr;}
  

  public String ToString() {
    return Name + " "+ Nazwisko + " " + Integer.toString(Age)+ " " + DataUr;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error","Nazwisko Error", -1,"Data Error");
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
  }
}