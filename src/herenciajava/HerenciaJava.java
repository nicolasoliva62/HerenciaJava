/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciajava;

/**
 *
 * @author Nicolas Oliva
 */
public class HerenciaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoPorComision empleado= new EmpleadoPorComision("Nico","Oliva","12342444",243,0.06);
//        System.out.println(empleado);
        EmpleadoBaseMasComisionHerencia e = new EmpleadoBaseMasComisionHerencia("Nico", "Oliva", "213213213",152, 0.5,2500);
        e.setTarifaComision(2);
        
        Cliente clienteUno = new Cliente(1, "Jose", "Perez","35212455","M",2,"4252223","Marcos Juarez 244");
        System.out.println(clienteUno.toString());
        
//        System.out.println(e);
    }
    
}
