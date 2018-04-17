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
public class Cliente extends Persona {
    
    private int codCliente;
    private String telefono;
    private String direccion;
    
    public Cliente(int idPersona, String nombre, String apellido, String dni, String sexo)
    {
        super(idPersona, nombre, apellido, dni, sexo);
        this.codCliente = idPersona;
    }
    
    
    public Cliente(int idPersona, String nombre, String apellido, String dni, String sexo,int codCliente, String tel,String dir) {
        super(idPersona, nombre, apellido, dni, sexo);
        this.codCliente = codCliente;
        this.direccion = dir;
        this.telefono = tel;                         
    }
            
    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return super.toString() + " Cliente{" + "codCliente=" + codCliente + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
    
}
