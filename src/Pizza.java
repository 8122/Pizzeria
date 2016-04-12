
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daw1
 */
public class Pizza {
    private String masa = "Normal";
    private String tipo = "Básica";
    private String tamaño = "Pequeña";
    private List<String> listaIngredientes = new ArrayList<>();
    private final double NORMAL = 9.0;
    private final double INTEGRAL = 9.5;
    private final double BASICA = 3.0;
    private final double CUATRO_QUESOS = 5.0;
    private final double BARBACOA = 7.0;
    private final double MEXICANA = 8.5;
    private final double JAMON = 0.5;
    private final double QUESO = 0.75;
    private final double TOMATE = 1.5;
    private final double CEBOLLA = 2.5;
    private final double OLIVAS = 1.0;
    private final double PEQUEÑA = 1.0;
    private final double MEDIANA = 1.15;
    private final double FAMILIAR = 1.3;
    
    DecimalFormat dosDec = new DecimalFormat("0.00");

    public Pizza(String masa, String tipo, String tamaño, List<String> listaIngredientes) {
        this.masa = masa;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.listaIngredientes = listaIngredientes;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    public List<String> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(List<String> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
    
    public Double calcularPrecio(){
        double precio = 0.0;
        switch(getMasa()){
            case "Normal":
                precio = NORMAL;
                break;
            case "Integral":
                precio = INTEGRAL;
        }
        switch(this.getTipo()){
            case "Básica":
                precio += BASICA;
                break;
            case "Cuatro quesos":
                precio += CUATRO_QUESOS;
                break;
            case "Barbacoa":
                precio += BARBACOA;
                break;
            case "Mexicana":
                precio += MEXICANA;
        }
        for(String ingrediente: listaIngredientes){
            if(ingrediente.equals("Jamón")){
                precio += JAMON;
            }
            if(ingrediente.equals("Queso")){
                precio += QUESO;
            }
            if(ingrediente.equals("Tomate")){
                precio += TOMATE;
            }
            if(ingrediente.equals("Cebollas")){
                precio += CEBOLLA;
            }
            if(ingrediente.equals("Olivas")){
                precio += OLIVAS;
            }
        }
        switch (this.getTamaño()) {
            case "Mediana":
                precio = precio*1.15;
                break;
            case "Familiar":
                precio = precio*1.3;
                break;
        }
        return precio;
    }
    
    public String pedido(){
        String resultado = "";
        double precioTotal;
        precioTotal = calcularPrecio();
        double suplemento = 0.0;
        switch(this.getMasa()){
            case "Normal":
                resultado += "Tipo de masa:\t"+this.getMasa()+"\t\t "+dosDec.format(NORMAL)+"\n";
                break;
            case "Integral":
                resultado += "Tipo de masa:\t"+this.getMasa()+"\t\t "+dosDec.format(INTEGRAL)+"\n";
        }
        switch(this.getTipo()){
            case "Básica":
                resultado += "Tipo de pizza:\t"+this.getTipo()+"\t\t "+dosDec.format(BASICA)+"\n";
                break;
            case "Cuatro quesos":
                resultado += "Tipo de pizza:\t"+this.getTipo()+"\t\t "+dosDec.format(CUATRO_QUESOS)+"\n";
                break;
            case "Barbacoa":
                resultado += "Tipo de pizza:\t"+this.getTipo()+"\t\t "+dosDec.format(BARBACOA)+"\n";
                break;
            case "Mexicana":
                resultado += "Tipo de pizza:\t"+this.getTipo()+"\t\t "+dosDec.format(MEXICANA)+"\n";
        }
        resultado += "Ingredientes extra:\n";
        int contador = 0;
        for(String ingrediente: listaIngredientes){
            if(ingrediente.equals("Jamón")){
                resultado += "\t"+ingrediente+"\t\t "+dosDec.format(JAMON)+"\n";
                contador++;
                suplemento += JAMON;
            }
            if(ingrediente.equals("Queso")){
                resultado += "\t"+ingrediente+"\t\t "+dosDec.format(QUESO)+"\n";
                contador++;
                suplemento += QUESO;
            }
            if(ingrediente.equals("Tomate")){
                resultado += "\t"+ingrediente+"\t\t "+dosDec.format(TOMATE)+"\n";
                contador++;
                suplemento += TOMATE;
            }
            if(ingrediente.equals("Cebollas")){
                resultado += "\t"+ingrediente+"\t\t "+dosDec.format(CEBOLLA)+"\n";
                contador++;
                suplemento += CEBOLLA;
            }
            if(ingrediente.equals("Olivas")){
                resultado += "\t"+ingrediente+"\t\t "+dosDec.format(OLIVAS)+"\n";
                contador++;
                suplemento += OLIVAS;
            }
            
        }
        if(contador == 0){
                resultado += "\tSin ingredientes extras\t 0.00\n";
        }
        resultado += "Tamaño:\t";
        switch(this.getTamaño()){
            case "Pequeña":
                suplemento = precioTotal*(1-1/PEQUEÑA);
                resultado += this.getTamaño()+"\t\t "+dosDec.format(suplemento);
                break;
            case "Mediana":
                suplemento = precioTotal*(1-1/MEDIANA);
                resultado += this.getTamaño()+"\t\t "+dosDec.format(suplemento);
                break;
            case "Familiar":
                suplemento = precioTotal*(1-1/FAMILIAR);
                resultado += this.getTamaño()+"\t\t "+dosDec.format(suplemento);
         }
        resultado += "\nTOTAL\t\t\t"+dosDec.format(precioTotal);
        return resultado;
    }
}
