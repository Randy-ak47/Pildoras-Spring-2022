package es.pildoras.ioc;

public class _01_JefeEmpleado implements _03_Empleados {
    public String getTareas(){
        return "Gestiono las cuestiones relativas a mis empleados de sección";
    }

    @Override
    public String getInforme() {
        return "Informe creado por el Jefe: " + informeNuevo.getInforme();
    }
    private _06_CreacionInformes informeNuevo;

    public _01_JefeEmpleado(_06_CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }
}
