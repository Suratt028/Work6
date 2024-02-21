

public class Test {
    public static void main(String[] args) {
        person p = new person();
        p.person();
    }
}


class person extends student {
    public void person(){
        System.out.println("Grade = "+grade);
    }
}

class count1{
    int c;
    void show1(){
        c = c+2;
    }
    void show2(){
        c = c+4;
    }
    void increment(){

    }
}


class student {
    double grade;
} 
