package Bai1;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String hobby;

    public Person(){}

    public Person(String name, int age, String gender, String hobby){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    @Override
    public String toString(){
        return "Name : " + getName() + "\n"+
                "Age : " + getAge() + "\n"+
                "Gender : " + getGender() + "\n"+
                "Hobby : " + getHobby() + "\n";
    }
}
