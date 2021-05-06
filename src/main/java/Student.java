public class Student
{
    private String name;
    private int age;

    public String GetName() {
        return name;
    }
    public void SetName(String nameFromOutside) {
        this.name=nameFromOutside;
    }

    public int GetAge() {
        return age;
    }
    public void SetAge(int ageFromOutSide) {
        this.age=ageFromOutSide;
    }

}
