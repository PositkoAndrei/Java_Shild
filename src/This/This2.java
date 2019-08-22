package This;

class Human {
    int age;
    int weight;
    int height;

    Human(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    Human(int age, int weight, int height) {
        this(age, weight);
        this.height = height;
    }
    void print(){
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);

    }

}


public class This2 {
    public static void main(String[] args) {
        Human man = new Human(35, 110, 185);
        man.print();
    }

}
