public class Course {

    //attributes
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sozluNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Ogretmen ve ders bolumleri uyusmuyor.");
        }

    }

    void printTeacherInfo() {
        if (this.teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + this.teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }

    }
    void sozluNote(int sozluNote){
       this.sozluNote = sozluNote;
    }

}
