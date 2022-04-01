package es.pildoras.ioc;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class _02_UsoEmpleados {
    public static void main(String[] args) {


        // Creación de objetos de tipo Empleados
        //_03_Empleados Empleado1 = new _05_DirectorEmpleado();
        
        // Uso de los objetos creados
        //System.out.println("Empleado1.getTareas() = " + Empleado1.getTareas());

        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
        _03_Empleados Juan = contexto.getBean("miEmpleado", _03_Empleados.class);
        System.out.println(Juan.getTareas());
        System.out.println(Juan.getInforme());
        contexto.close();
    }

}
