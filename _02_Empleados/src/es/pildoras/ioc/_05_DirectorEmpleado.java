package es.pildoras.ioc;

public class _05_DirectorEmpleado implements _03_Empleados {
    @Override
    public String getTareas() {
        return "Gestionar la plantilla de la empresa";
    }

    @Override
    public String getInforme() {
        return "Informe creado por el Director: " + informeNuevo.getInforme();
    }
    //creación de campo tipo creacionInforme (interfaz)
    private _06_CreacionInformes informeNuevo;

    //creación del constructor
    public _05_DirectorEmpleado(_06_CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }
}
