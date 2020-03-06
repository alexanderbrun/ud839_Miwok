package com.example.android.miwok;

public class MyGrades {
    final int excellentGrade = 5;
    final int goodGrade = 4;
    final int satGrade = 3;
    final int badGrade = 2;

    private String name;
    private int englshGrade = goodGrade;
    private int programmingGrade = excellentGrade;

    public MyGrades(String name, int eng, int prog) {
        this.name = name;
        this.englshGrade = eng;
        this.programmingGrade = prog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnglshGrade() {
        return englshGrade;
    }

    public void setEnglshGrade(int grade) {
        if (grade >= 2 && grade <= 5) {
            englshGrade = grade;
        } else {
            System.out.println("Неверная оценка");
        }
    }

    public int getProgrammingGrade() {
        return programmingGrade;
    }

    public void setProgrammingGrade(int grade) {
        if (grade >= 2 && grade <= 5) {
            programmingGrade = grade;
        } else {
            System.out.println("Неверная оценка");
        }
    }

    @Override
    public String toString() {

        return "Grades:" + "Name " + name +
                "English" + englshGrade +
                "Programming" + programmingGrade;
    }
}