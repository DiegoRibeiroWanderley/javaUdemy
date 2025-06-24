package projeto_5.entities;

public class Student {

    public String name;
    public double grade_1;
    public double grade_2;
    public double grade_3;

    public double finalGrade(){
        return grade_1 + grade_2 + grade_3;
    }

    public String finalResult(){
        String resultado;
        if (finalGrade() >= 60){
            resultado = String.format("FINAL GRADE = %.2f\nPASS", finalGrade());
            }else{
            resultado = String.format("FINAL GRADE = %.2f\nFAILED\nMISSING %.2f", finalGrade(), 60 - finalGrade());
        }
        return resultado;
    }
}
