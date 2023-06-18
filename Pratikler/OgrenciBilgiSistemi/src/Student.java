public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String studentNo;
    String year;
    double average;
    boolean isPass;

    Student(String name, String studentNo, String year, Course course1, Course course2, Course course3) {
        this.name = name;
        this.studentNo = studentNo;
        this.year = year;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1,int sozlu1, int note2,int sozlu2, int note3,int sozlu3) {
        if (note1 >= 0 && note1 <= 100) {
            this.course1.note = note1;
            this.course1.sozluNote(sozlu1);
            this.course1.note = (this.course1.sozluNote) * 0.2 + (this.course1.note) * 0.8;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.course2.note = note2;
            this.course2.sozluNote(sozlu2);
            this.course2.note = (this.course2.sozluNote) * 0.2 + (this.course2.note) * 0.8;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.course3.note = note3;
            this.course3.sozluNote(sozlu3);
            this.course3.note = (this.course3.sozluNote) * 0.2 + (this.course3.note) * 0.8;
        }
    }

    void printNote() {

        System.out.println(this.course1.name + " Notu : " + this.course1.note);
        System.out.println(this.course2.name + " Notu : " + this.course2.note);
        System.out.println(this.course3.name + " Notu : " + this.course3.note);
        System.out.println("Ortalamaniz : " + this.average);
    }

    void isPass() {
        System.out.println("========================================");
        this.average = (this.course1.note + this.course2.note + this.course3.note) / 3.0;
        if (this.average > 55) {
            System.out.println("Sinifi gectiniz!");
            this.isPass = true;
        } else {
            System.out.println("Sinifta kaldiniz!");
            this.isPass = false;
        }
        printNote();
    }
}
