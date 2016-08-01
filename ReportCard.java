package com.czettner.android.reportcard;

import java.util.ArrayList;

public class ReportCard {
    protected ArrayList<Byte> grade = new ArrayList<>(); // we use grade system 1-5, where 5 is the best grade
    String studentName; // The student's name on the card
    int year; // The year when the class started

    /**
     * ReportCard constructor
     *
     * @param studentName Student's name
     * @param year Starting year
     */
    public ReportCard(String studentName, int year) {
        this.studentName = studentName;
        this.year = year;
    }

    /**
     * Add grade for a study topic
     *
     * @param grade Grade 1-5
     */
    public void addGrade(Byte grade) {
        this.grade.add(grade);
    }

    /**
     * Calculate average grade for student.
     *
     * @return int Average
     */
    public int getAverage() {
        int avg = 0;
        for (Byte g : grade) {
            avg += g;
        }
        avg = avg / grade.size();
        return avg;
    }

    /**
     * Get student's name
     *
     * @return String Student's name
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Get year
     *
     * @return int Year
     */
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "average='" + getAverage() + '\'' +
                ", studentName='" + studentName + '\'' +
                ", year=" + year +
                '}';
    }

}
