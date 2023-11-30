package Dipendente;

import java.util.Random;

public  class Dipendente {

    /*----ATTRIBUTI----*/
    private static final int salaryMin=1000;
    private double idSalary;
    private short idNumber;
    private float salaryPerHourExtra;
    private Dipartimento department;
    private Livello level;

    /*-----------------*/



Random rand=new Random();
    public Dipendente(short IDnumber, double idSalary, float salaryPerHourExtra,
                      Dipartimento department, Livello level){
        this.idNumber=IDnumber;
        int salaryMin = Dipendente.salaryMin;
        this.idSalary=idSalary;
        this.salaryPerHourExtra=salaryPerHourExtra;
        this.department=department;
        this.level=level;
    }
    public Dipendente(int ID,String dipartimento){
        this.idSalary=salaryMin;
        this.salaryPerHourExtra=30;
        this.level= Livello.OPERAIO;
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

    public Dipartimento getDepartment() {
        return department;
    }

    public Livello getLevel() {
        return level;
    }

    public float getSalaryPerHourExtra() {
        return this.salaryPerHourExtra;
    }



    /*---SET---*/
    public void setSalaryPerHourExtra(float salaryPerHourExtra) {
        this.salaryPerHourExtra = salaryPerHourExtra;
    }

    public void setDepartment(Dipartimento department) {
        this.department = department;
    }


    /*----------*/



    public void datiDipendente(){}
    public Livello promuovi(){
        switch (this.level){
            case OPERAIO ->{
                this.level = Livello.IMPIEGATO;
                this.idSalary=(this.idSalary*1.2);
            }
            case IMPIEGATO -> {
                this.level=Livello.QUADRO;
                this.idSalary=(this.idSalary*1.5);
            }
            case
        }
    }

    /*----FINE----*/

}


//    @Override
//    public String toString() {
//        return "Dipendente: {" +
//                this.idSalary + " " + this.level +"}";
//    }