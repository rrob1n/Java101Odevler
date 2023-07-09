public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        // Yilin 2021 olarak alinmasi istenmis
        if ((2021 - hireYear) < 10) {
            return salary * 0.05;
        }
        if ((2021 - hireYear) > 9 && (2021 - hireYear) < 20) {
            return salary * 0.10;
        }
        if ((2021 - hireYear) > 20) {
            return salary * 0.15;
        }
        return 0;
    }

    public void sonuclariYazdir() {
        System.out.println("Adi : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma Saati : " + this.workHours);
        System.out.println("Baslangic Yili : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maas artisi : " +   raiseSalary());
        System.out.println("Vergiler ve Bonuslar ile birlikte maas : " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maas : " + (this.salary + raiseSalary()));
    }
}
