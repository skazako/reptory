package ua.artcode.week2;

/**
 * Created by Sem on 23.01.2016.
 */
//import javax.security.auth.Subject;

public class Student {

    private static double monthMoney = 790;
    private static int idCounter = 0;
    private int subjCount = 0;
    private String idNum;
    private String name;
    private int rank;

    private MyDate birthday;
    private Address address;
    private Contact contact;
    private Subject[] subjects = new Subject[5];

    public Student() {
    }

    // run before constructors
    {
        this.idNum = String.valueOf(idCounter);
        idCounter++;
    }

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public Student(String name, MyDate birthday,
                   Address address, Contact contact) {//, Subject[] subjects){

        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.contact = contact;
        //    this.subjects = subjects;
    }

    //----------------------------------------------------------------------------------------------------------------
    public boolean addSubject(Subject subject) {
        // SubjectFactory.createSubject(subjId);
        int initialCount = subjCount;
        subjects[subjCount] = subject;
        subjCount++;
        if (subjCount > initialCount) {
            System.out.println("Successfully added subject " + subject.getName() + " to a student " + this.name);
            return true;
        }
        System.out.println("ERROR: There was an issue adding subject to a student " + this.name);
        return false;
    }

    public boolean deleteLastSubject(){
        int initialCount = subjCount;
        subjCount--;
        subjects[subjCount] = null;
        if (subjCount < initialCount) {
            System.out.println("Successfully deleted last subject from a student " + this.name);
            return true;
        }
        System.out.println("ERROR: There was an issue deleting subject from a student " + this.name);
        return false;
    }




    public int subjectsCount() {
        return subjCount;
    }

    public Subject[] getSubjects() {

        //"STUDENT NAME: " + name +
        //"\n"+ "Count " + subjCount + "\n";

        for (int i = 0; i < subjCount; i++) {
            Subject subject = subjects[i];
        }


        return subjects;
    }

    public double averageMark() {

        double countrank = 0;

        for (int i = 0; i < subjCount; i++) {
            Subject subject = subjects[i];
            countrank += subject.getRank();
        }

        return countrank/subjCount;
    }

    /*
    *
    * @return total subject studied hours
    *
    * */
    public int learn(Subject subject, int hours) {

        subject.setHoursStudWorked(subject.getHoursStudWorked() + hours);

        return subject.getHoursStudWorked();
    }

    public String asString() {
        String res = String.format("id %s, name %s, birthday %s, address %s \n",
                idNum, name, birthday.asString(), address.asString());

        for (int i = 0; i < subjCount; i++) {
            Subject subject = subjects[i];
            res += subject.asString() + "\n";
        }

        return res;
    }

    //public Subject getSubject(String subjId) {
    //    return null;
    //}

//----------------------------------------------------------------------------------------------------------------

    public static double getMonthMoney() {
        return monthMoney;
    }

    public String getIdNum() {
        return idNum;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }


    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

}