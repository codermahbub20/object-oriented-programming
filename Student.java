import java.util.Scanner;

public class Student {
    String name, email, gender, department, batch;
    int id, age, phone;
    double monthlyFee;
     long nidNumber;
    Scanner input;
    // constructor
    public Student(String name, String email, String gender, String department, String batch, int id,int age, int phone, long nidNumber, double monthlyFee){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.batch = batch;
        this.nidNumber = nidNumber;
        this.monthlyFee = monthlyFee;
       this.input = new Scanner(System.in);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public void setNidNumber(long nidNumber) {
        this.nidNumber = nidNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public String getBatch() {
        return batch;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getPhone() {
        return phone;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public long getNidNumber() {
        return nidNumber;
    }
  
    //display method
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Batch: " + batch);
        System.out.println("Monthly Fee: " + monthlyFee);
        System.out.println("Gender: " + gender);
        System.out.println("NID Number: " + nidNumber);
    }

    // void display(){
    //     System.out.println(this);
    // }

    //find method

    void find(String findName){    
        if(findName.equals(name)){
            display();
        }else{
            System.out.println("No data found");
        }


    }
    

    // update method

    // 1. changeName method
    void changeName(){
        
        System.out.print("Enter new Name: ");
        String newName = input.nextLine();
        name = newName;
        System.out.println("Successfully Changed!!");

    }

        // change E-mail
    void changeMail(){
        System.out.print("Enter new E-mail: ");
        String newMail = input.nextLine();
        email = newMail;
        System.out.println("You have successfully changed!!");
    }

        // change Phone Number
    void changePhone(){
        System.out.print("Enter new Phone Number: ");
        int newPhone = input.nextInt();
        input.nextLine();
        phone = newPhone;
        System.out.println("You have successfully changed!!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         Student s1 = null;
        while(true){

        System.out.println("========= Main Menu =========");
        System.out.println("1. Add Student");
        System.out.println("2. Display");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Find");
        System.out.println("0. Exit");
        System.out.println("=============================");

        int option, select;
        System.out.print("Enter Menu: ");
        option = input.nextInt();
        input.nextLine();

        // perform each menu by switch statements for entering option
       
        switch(option){
            case 0:
            System.out.println("Menu is terminated");
            return;

            case 1:
            System.out.print("Enter name: ");
            String name = input.nextLine();
            // input.nextLine();
            System.out.print("Enter E-mail: ");
            String email = input.nextLine();
            System.out.print("Enter Phone: ");
            int phone = input.nextInt();
            input.nextLine();
            System.out.print("Enter ID: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Enter Age: ");
            int age = input.nextInt();
            input.nextLine();
            System.out.print("Enter Department: ");
            String department = input.nextLine();
            // input.nextLine();
            System.out.print("Enter Batch: ");
            String batch = input.nextLine();
            // input.nextLine();
            System.out.print("Enter Monthly Fee: ");
            double monthlyFee = input.nextDouble();
            input.nextLine();
            System.out.print("Enter Gender: ");
            String gender = input.nextLine();
            // input.nextLine();
            System.out.print("Enter NID Number: ");
             long nidNumber = input.nextLong();
            input.nextLine();

             s1 = new Student(name, email, gender,department, batch,id, age, phone, nidNumber, monthlyFee);
            break;

            case 2:
                if(s1 != null){
                    s1.display();
                }else{
                    System.out.println("There is no data!!");
                }

                break;

            case 3:
                System.out.println("======== Changes =======");
                System.out.println("1. Name Change");
                System.out.println("2. E-mail Change");
                System.out.println("3.Phone Number Change");

                System.out.println("=======================");
                System.out.print("Select Option: ");
                select = input.nextInt();
                input.nextLine();

   

                switch(select){
                    case 1:
                        if(s1 != null){
                            s1.changeName();
                        }else{
                            System.out.println("You have no data!! please insert data first");
                        }
                        
                        break;
                    case 2:
                        if(s1!=null){
                            s1.changeMail();
                        }else{
                            System.out.println("You have no data!! please insert data first");
                        }
                        break;
                    case 3:
                        if(s1!=null){
                            s1.changePhone();
                        }else{
                            System.out.println("You have no data!! please insert data first");
                        }
                     
                }

                case 5:
                    System.out.print("Enter name: ");
                    String searchName = input.nextLine();
                    s1.find(searchName);
                break;

        }
        
        
    }
        


    }
}
