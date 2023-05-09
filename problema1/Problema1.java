package problema1;
class Estudiante {
    private String nombreEstudiante;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private Universidad universidad;

    public Estudiante() {

    }

    public Estudiante(String nombreEstudiante, double nota1, double nota2, double nota3, Universidad universidad) {
        this.nombreEstudiante = nombreEstudiante;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        this.promedio = ((this.getNota1() + this.getNota2() + this.getNota3())/ 3);

    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombreEstudiante='" + nombreEstudiante + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", promedio=" + promedio +
                '}';
    }
}

class Universidad {
    private String nombreUniv;
    private String direccion;

    public Universidad() {

    }

    public Universidad(String nombreUniv, String direccion) {
        this.nombreUniv = nombreUniv;
        this.direccion = direccion;
    }

    public String getNombreUniv() {
        return nombreUniv;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombreUniv(String nombreUniv) {
        this.nombreUniv = nombreUniv;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombreUniv='" + nombreUniv + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

public class Problema1 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        Universidad universidad = new Universidad();
        Universidad universidad1 = new Universidad("UTPL","San Cayetano");
        Universidad universidad2=new Universidad("UIDE","Centro Loja");
        Estudiante estudiante1 = new Estudiante("Oscar", 10, 10, 10,universidad1);
        estudiante1.calcularPromedio();
        System.out.println(estudiante1);
    }
}