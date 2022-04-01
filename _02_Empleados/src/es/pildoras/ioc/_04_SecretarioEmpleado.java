package es.pildoras.ioc;

public class _04_SecretarioEmpleado implements _03_Empleados {
    @Override
    public String getTareas() {
        return "Gestionar la agenda de los jefes";
    }

    @Override
    public String getInforme() {
        return null;
    }
}
