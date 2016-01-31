package ua.artcode.week2.University;

/**
 * Created by Sem on 24.01.2016.
 */
public class TestStudent {

    public static void main(String[] args) {

        MyDate myDate = new MyDate(1990,7,12);

        Student student1 =
                new Student("Oleg", myDate,
                        new Address("UA","Kiev","peremogy sqr", 34),
                        new Contact("+343434334", null));
        Student student2 =
                new Student("Petya", myDate,
                        new Address("UA","Odessa","derebasovskaya st", 2),
                        new Contact("+34300000", null));

        Group group = new Group("ACO-11");

        group.addStudent(student1);
        group.addStudent(student2);

        student1.addSubject(new Subject("Biology", 120, 120, 3));
        student1.addSubject(new Subject("Physics", 120, 110, 4));

        student2.addSubject(new Subject("Biology", 120, 120, 4));
        student2.addSubject(new Subject("OOP", 48, 12, 5));

        System.out.println("\n*********************************************");

        System.out.println(student1.asString());
        System.out.println(student2.asString());

        System.out.println((student1.getSubjects()[1].studentRankForSubj().equals("Physics is 4 points")) + " " + student1.getName() + "'s rank for subject " + student1.getSubjects()[1].studentRankForSubj());
        System.out.println((student1.averageMark() == 3.50) + " " + student1.getName() + "'s average mark is " + student1.averageMark());
        System.out.println((student2.averageMark() == 4.50) + " " + student2.getName() + "'s average mark is " + student2.averageMark());

        student2.learn(student2.getSubjects()[1],3);
        System.out.println((student2.getSubjects()[1].getHoursStudWorked() == 15) + " Current hours " + student2.getName() + " worked on: " + student2.getSubjects()[1].getName() + " is " + student2.getSubjects()[1].getHoursStudWorked() + " hours\n");


        System.out.println(student1.getSubjects()[0].passExam() + " " + student1.getName() + " passed " + student1.getSubjects()[0].getName() + " exam");
        System.out.println(student1.getSubjects()[1].passExam() + " " + student1.getName() + " passed " + student1.getSubjects()[1].getName() + " exam\n");

        student1.deleteLastSubject();

        System.out.println("\n*********************************************");

        System.out.println(student1.asString());

        System.out.println();

        /*
        System.out.println();
        System.out.println((group.getSize() == 2) + " addStudent");

        Student found = group.findById(student1.getIdNum());
        System.out.println((found != null) + " findById");

        Student[] filteredByCity = group.filterByCity("Kiev");
        System.out.println((filteredByCity != null && filteredByCity.length == 1) + " filterByCity");

        Student[] filteredByName = group.filterByName("Oleg");
        System.out.println((filteredByName != null && filteredByName.length == 2) + " filterByName");

        group.deleteLastStudent();
        System.out.println((group.getSize() == 1) + " deleteLast");
        System.out.println();

        Student[] sorted = group.sort();

        System.out.println(group.asString());
        */




    }
}