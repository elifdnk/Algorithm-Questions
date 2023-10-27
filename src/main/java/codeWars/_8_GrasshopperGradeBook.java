package codeWars;

public class _8_GrasshopperGradeBook {

    public static char getGrade(int s1, int s2, int s3) {

        int average = (s1+s2+s3)/3;

        if(average>=90 && average<=100){
            return 'A';
        }else if(average>=80){
            return 'B';
        }else if(average>=70){
            return 'C';
        }else if(average>=60){
            return 'D';
        }else
            return 'F';

    }

    public static char getGrade2(int s1, int s2, int s3) {  //Ternary solution
        s1=(s1+s2+s3)/3;
        return s1 >= 90 ? 'A':s1 >= 80 ? 'B':s1 >= 70 ? 'C':s1 >= 60 ? 'D':'F';
    }

    public static char getGrade3(int s1, int s2, int s3) {  //switch solution
        switch ((s1 + s2 + s3) / 30) {
            case 10:return 'A';
            case 9: return 'A';
            case 8: return 'B';
            case 7: return 'C';
            case 6: return 'D';
            default: return 'F';
        }
    }

}
/*
Grade book
Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.

Numerical Score	Letter Grade
90 <= score <= 100	'A'
80 <= score < 90	'B'
70 <= score < 80	'C'
60 <= score < 70	'D'
0 <= score < 60	'F'
Tested values are all between 0 and 100. Theres is no need to check for negative values or values greater than 100.
 */