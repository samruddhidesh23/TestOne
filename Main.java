package StudentManagementSystem;

public class Main {

    public static void main(String[] args) {

        int [] student1 = new int[]{90,100,80,70,60};
        int [] student2 = new int[]{80,60,80,70,60};
        int [] student3 = new int[]{100,100,100,100,100};
        int [] student4 = new int[]{90,100,60,70,60};
        int [] student5 = new int[]{30,40,80,70,60};


        Student [] students = new Student[5];
        students[0] = new Student("Samruddhi",24,101);
        students[1] = new Student("Snehal",26,102);
        students[2] = new Student("Bhavana",20,103);
        students[3] = new Student("Sakshi",22,104);
        students[4] = new Student("Jiya",22,105);

        for (int i=0;i<students.length;i++){
            students[i].getDetail();
        }

        scholarshipEligibility se = new Student();
        se.isEligibleForScholarship(student1);
        se.isEligibleForScholarship(student2);
        se.isEligibleForScholarship(student3);
        se.isEligibleForScholarship(student4);
        se.isEligibleForScholarship(student5);


    }
}
