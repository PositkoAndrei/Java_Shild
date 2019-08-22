package This;

class Human3 {
    private String name;
    int age;
    int weight;
    int height;

    Human3(int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void print(){
        System.out.println(name);

    }

}

public class ThisHuman {
    public static void main(String[] args) {
        Human3 person1 = new Human3(35, 110, 185);

        person1.setName("Vasia");
        System.out.print("Имя: ");
        person1.print();


        System.out.println("Возраст: " + person1.age + " лет\n" +
                "Вес: " + person1.weight + " кг\n" +
                "Рост: " + person1.height + " см!");
    }
}
