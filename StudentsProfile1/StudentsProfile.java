package StudentsProfile1;



public class StudentsProfile {
    String firstName;
    String lastName;
    String declaredmajor;
    double gpa;
    int expectedgraduatedyear;

    public  StudentsProfile (String firstName, String lastName, String declaredmajor, double gpa, int expectedgraduatedyear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredmajor = declaredmajor;
        this.gpa = gpa;
        this.expectedgraduatedyear = expectedgraduatedyear;
        
    }



    public void incremnetalexpectedyear(){
        this.expectedgraduatedyear = this.expectedgraduatedyear + 1;
    }
    
}
