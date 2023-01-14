package StudentsProfile1;

public class Main {

    
    public static void main(String[] args){
        StudentsProfile profileone = new StudentsProfile("Pravin", "Shinde", "Cybersecurity", 4.0, 2021);
        StudentsProfile profiletwo = new StudentsProfile("ABC", "DFE", "cs", 3.75, 2021);

        System.out.println("Expected Year of graduation of Student1: - " + " " + profileone.expectedgraduatedyear);
        
        profiletwo.incremnetalexpectedyear();
        System.out.println("Expected graduation of student2" + " " + profiletwo.expectedgraduatedyear);



    }
    
}
