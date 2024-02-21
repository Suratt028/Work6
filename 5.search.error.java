package 5.package1;

public class student {
    double grade;
}
package 5.package2;

public class person {
    person(){ ///หากใช้ทดสอบต้องใส่ AccessModifiers
        System.out.println("Grade =" + grade);
        //// เนื่องจาก grade อยู่ใน class ของ student ที่อยู่่ในคนละ package ทำให้ ตัวแปรเกรดไม่สามารถใช้ได้
    }
}
class count1{
    int c;
    void show(){
        c = c+2;
    }
    ///ทั้งสอง method นี้ มีชื่อเหมือนกันและมี Signature ที่เหมือนกันทำให้ไม่สามารถใช้ method ได้
    void show(){
        c = c+2;
    }
    void increment();/// เนื่องจากไม่มีปีกกา
}
