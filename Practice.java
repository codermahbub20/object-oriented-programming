import java.util.Scanner;

public class Practice {
    String name, email, gender, department, batch;
    int id, age, phone;
    double monthlyFee;
    long nidNumber;
    Scanner input;

    public Practice(String name, String email, String gender, String department, String batch, int id, int age,int phone, double monthlyFee, long nidNumber) {
            this.name = name;
            this.email = email;
            this.gender = gender;
            this.department = department;
            this.batch = batch;
            this.id = id;
            this.age = age;
            this.phone = phone;
            this.monthlyFee = monthlyFee;
            this.nidNumber = nidNumber;
            this.input = new Scanner(System.in);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setBatch(String batch){
        this.batch = batch;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }
    public void setMonthlyFee(double monthlyFee){
        this.monthlyFee = monthlyFee;
    }
    public void setNidNumber(long nidNumber){
        this.nidNumber = nidNumber;
    }

}
