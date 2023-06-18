public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Mahmut","5055053211","TRH");
        Teacher teacher2 = new Teacher("Graham","5065063211","FZK");
        Teacher teacher3 = new Teacher("Külyutmaz","5075073211","BIO");


        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(teacher1);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(teacher2);
        Course bio = new Course("Biyoloji","101","BIO");
        bio.addTeacher(teacher3);

        Student student1 = new Student("Inek Saban","999","4",tarih,fizik,bio);
        student1.addBulkExamNote(80,100,60,80,90,80);
        student1.isPass();
        Student student2 = new Student("Necmi","998","3",tarih,fizik,bio);

        




    }
}