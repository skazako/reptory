package ua.artcode.week2;

/**
 * Created by Sem on 24.01.2016.
 */
public class Subject {

    private String name;
    private int hoursPerSemester;
    private int hoursStudWorked = 0;
    private int rank;

    public Subject(String name, int hoursPerSemester, int hoursStudWorked, int rank) {
        this.name = name;
        this.hoursPerSemester = hoursPerSemester;
        this.hoursStudWorked = hoursStudWorked;
        this.rank = rank;
    }

    public boolean passExam(){

        if (this.hoursStudWorked >= this.hoursPerSemester && this.rank >= 3){
            return true;
        }
        return false;
    }

    public String getSubjInfo(){

        return asString();
    }

    public  String studentRankForSubj() {

        return this.name + " is " + this.rank + " points";
    }

    public String asString (){
        return String.format("Subject: %s | hours per semester %d | hours completed by student %d | rank %d",
                name, hoursPerSemester, hoursStudWorked, rank);
    }

    public void setHoursStudWorked(int hoursStudWorked) {
        this.hoursStudWorked = hoursStudWorked;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public int getHoursStudWorked() {
        return hoursStudWorked;
    }



}
