/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciajava;

import com.sun.imageio.plugins.jpeg.JPEG;

/**
 *
 * @author Nicolas Oliva
 */
public class EmpleadoBaseMasComisionHerencia extends EmpleadoPorComision 
{
    private double salarioBase;
    public EmpleadoBaseMasComisionHerencia(String nombre, String apellido, String nss, double ventas, double tarifa,double salario) {
        super(nombre, apellido, nss, ventas, tarifa);
        setTarifaComision(tarifa);
        setSalarioBase(salario);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = (salarioBase<0.0) ? 0.0:salarioBase;
    }            
    
    @Override
    public double ingresos()
    {
//        return this.salarioBase + (this.getVentasBrutas()*this.getTarifaComision());
        return super.ingresos();
    }
    
    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f","Empleado pr comision con sueldo base",
                getPrimerNombre(),getApellidoPaterno(),"numero de seguro social",getNumeroSeguroSocial(),"ventas brutas",getVentasBrutas(),"tarifa de comision",
                getTarifaComision(),"Salario base:",salarioBase);
    }
}
