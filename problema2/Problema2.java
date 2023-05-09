package problema2;
class Profesores {
    private String nombreProfe;
    private String apellidosProfe;
    private double sueldoBasico;
    private double sueldoTotal;
    private int numCedula;
    private Provincia provincia;
    private String nomProvincia;


    public Profesores() {

    }

    public Profesores(String nombreProfe, String apellidosProfe, double sueldoBasico, int numCedula,String nomProvincia,Provincia provincia1) {
        this.apellidosProfe = apellidosProfe;
        this.nombreProfe = nombreProfe;
        this.sueldoBasico = sueldoBasico;
        this.numCedula = numCedula;
    }

    public String getNombreProfe() {
        return nombreProfe;
    }

    public String getApellidosProfe() {
        return apellidosProfe;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public int getNumCedula() {
        return numCedula;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void setNombreProfe(String nombreProfe) {
        this.nombreProfe = nombreProfe;
    }

    public void setApellidosProfe(String apellidosProfe) {
        this.apellidosProfe = apellidosProfe;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setNumCedula(int numCedula) {
        this.numCedula = numCedula;
    }

    public void calcularSueldoTotal() {
        this.sueldoTotal = sueldoBasico * 1.20;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "nombreProfe='" + nombreProfe + '\'' +
                ", apellidosProfe='" + apellidosProfe + '\'' +
                ", sueldoBasico=" + sueldoBasico +
                ", sueldoTotal=" + sueldoTotal +
                ", numCedula=" + numCedula +
                '}';
    }
}
class Provincia{
    private String nombreProvi;
    private int numHabi;
    public Provincia(){

    }
    public Provincia(String nombreProvi,int numHabi){
        this.nombreProvi=nombreProvi;
        this.numHabi=numHabi;
    }

    public void setNombreProvi(String nombreProvi) {
        this.nombreProvi = nombreProvi;
    }

    public void setNumHabi(int numHabi) {
        this.numHabi = numHabi;
    }

    public String getNombreProvi() {
        return nombreProvi;
    }

    public int getNumHabi() {
        return numHabi;
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "nombreProvi='" + nombreProvi + '\'' +
                ", numHabi=" + numHabi +
                '}';
    }
}

public class Problema2 {
    public static void main(String[] args) {
        Profesores profesor1 = new Profesores();
        Provincia provincia1=new Provincia("Loja",10000);
        Profesores profesor2 = new Profesores("Oscar", "Cañellas", 400.87, 50,"LOJA",provincia1);
        profesor2.calcularSueldoTotal();
        System.out.println(profesor2);
        System.out.println(provincia1);
    }
}