package arreglospoo;

public class Vehículo {

    String volante;
    String Tipo_combustible;
    String Modo_Movimiento;

    public Vehículo(){
        
    }
    public Vehículo(String volante, String Tipo_combustible, String Modo_Movimiento) {
        this.volante = volante;
        this.Tipo_combustible = Tipo_combustible;
        this.Modo_Movimiento = Modo_Movimiento;
    }

    
    public String getVolante() {
        return volante;
    }

    public void setVolante(String volante) {
        this.volante = volante;
    }

    public String getTipo_combustible() {
        return Tipo_combustible;
    }

    public void setTipo_combustible(String Tipo_combustible) {
        this.Tipo_combustible = Tipo_combustible;
    }

    public String getModo_Movimiento() {
        return Modo_Movimiento;
    }

    public void setModo_Movimiento(String Modo_Movimiento) {
        this.Modo_Movimiento = Modo_Movimiento;
    }

    public void moverse() {

    }

    public void acelerar() {

    }

}
