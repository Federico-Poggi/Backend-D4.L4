package Dipendente;

public class Dipendente1 extends Dipendente  {
    private Dipartimento departement;

    public  Dipendente1 (short IDnumber, double idSalary, float salaryPerHourExtra,
                       Dipartimento department, Livello level){
        super( IDnumber,idSalary,salaryPerHourExtra, department,level );
    }


    @Override
    public Dipartimento setDepartment(Dipartimento department) {
        return this.departement;
    }
}
