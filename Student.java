package StudentManagementSystem;

public class Student extends Person implements scholarshipEligibility{

    private int StudentId;
    private int [] grade;
    private float averageOfStudent;
    private int count;
    private static int totalStudent = 0;

    public Student(){
        super("NA",20);
    }

    public Student(String name, int age, int studentId) {
        super(name, age);
        StudentId = studentId;
        count = totalStudent++;
    }

    @Override
    public void getDetail() {
        System.out.println("id: "+StudentId);
        System.out.println("Name: "+getName());
        System.out.println("age: "+getAge());
    }

    public float  getAverageGrade(int [] grade){
        this.grade=grade;
        int sum = 0;

        for(int i =0;i<grade.length;i++){
            sum = sum+ grade[i];
        }
        averageOfStudent = sum/grade.length;
        return averageOfStudent;

    }

    @Override
    public void isEligibleForScholarship(int [] grade) {
        this.grade=grade;
        int sum = 0;

        for(int i =0;i<grade.length;i++){
            sum = sum+ grade[i];
        }
        averageOfStudent = sum/grade.length;
        if(averageOfStudent>85){
            System.out.println("The student is eligible for scholarship");
        }else {
            System.out.println("The student is not eligible for scholarship");
        }
    }

    public void getTotalStudent(){
        System.out.println("The total number of student is "+count);
    }

    class Course{
        private String courseCode;
        private String courseName;

        public Course(String courseCode, String courseName) {
            this.courseCode = courseCode;
            this.courseName = courseName;
        }

        public String getCourseCode() {
            return courseCode;
        }

        public void setCourseCode(String courseCode) {
            this.courseCode = courseCode;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }
    }
}
