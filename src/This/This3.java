package This;

class Human2 {
    String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    void print(){
        System.out.println(name);
    }
}

public class This3 {
    public static void main(String[] args) {
        Human2 pers = new Human2();
        pers.setName("Vasia");
        pers.print();
    }

}
