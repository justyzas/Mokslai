public class Person {
    String name = "Default Name";
    int age = 18;
    String skinColor = "black";

    
    public Person() {
    }

    public Person(String name, int age, String skinColor) {
        this.name = name;
        this.age = age;
        this.skinColor = skinColor;
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
    public String getSkinColor() {
        return skinColor;
    }
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", skinColor=" + skinColor + "]";
    }
}
