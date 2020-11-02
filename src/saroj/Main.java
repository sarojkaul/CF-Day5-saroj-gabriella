package saroj;

public class Main {
    String firstname;
    String lastname;
    int age;

    public Main(String firstname, String lastname,int age){
     this.firstname = firstname;
     this.lastname = lastname;
     this.age = age;
    }

    @Override
    public String toString() {
        return "Main{" +
                "firstname=" + firstname +
                ", lastname=" + lastname +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {


    }
    public void displayMain(){
        System.out.println("First Name" +this.firstname +"   "+"Last name" +this.lastname +"   "+"age" +this.age);
    }
}

