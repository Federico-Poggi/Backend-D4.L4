package ClassePadre;

import java.util.Random;

public class Dipendente {

    private final int salaryMin=1000;
    private float idSalary;
    private short idNumber;
    private float salaryPerHourExtra;
    private String department;
    private String level;



    private enum Livello{
        OPERAIO,
        IMPIEGATO,
        QUADRO,
        DIRIGENTE,
    }
    private enum Department{
        PRODUZIONE,
        AMMINISTRAZIONE,
        VENDITE,
    }

Random rand=new Random();
    public Dipendente(short IDnumber, float idSalary, float salaryPerHourExtra, String department, String level){
        this.idNumber=IDnumber;
        int salaryMin = this.salaryMin;
        this.idSalary=idSalary;
        this.salaryPerHourExtra=salaryPerHourExtra;
        this.department=getDepartment();
        this.level=level;
    }
    public Dipendente(int ID,String dipartimento){
        this.idSalary=salaryMin;
        this.salaryPerHourExtra=30;
        this.level="OPERAIO";
    }

/* -----METODI----- */

    /*---GET---*/

    public int getSalaryMin() {
        return this.salaryMin;
    }

    public short getIdNumber() {
        return this.idNumber;
    }

    public float getIdSalary() {
        return this.idSalary;
    }
    public String getLevel() {
        return this.level;
    }

    public float getSalaryPerHourExtra() {
        return this.salaryPerHourExtra;
    }

    public String getDepartment() {
        return this.department;
    }

    public void getDipendenti(){
        System.out.println("Matricola:\n"+this.getIdNumber()+ "\n" + "Salario minimo:" + getSalaryMin()+ "\n" + "Salario Dipendente:\n"
                + getIdSalary() + "\n" + "Extra all'ora:\n"+ getSalaryPerHourExtra() + "Dipartimento:\n"+ getDepartment() + "\n" +"Livello:\n"
                +getLevel());
    }

    /*---SET---*/
    public void setSalaryPerHourExtra(float salaryPerHourExtra) {
        this.salaryPerHourExtra = salaryPerHourExtra;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    /*----FINE----*/

}
