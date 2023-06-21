package arreglospoo;

public class Moto extends Vehículo {

    String modelo;
    int N_llantas;
    String tipo;
    
    public Moto(){
        
    }

     public Moto(String modelo, int N_llantas, String tipo, String volante, String Tipo_combustible, String Modo_Movimiento) {
        super(volante, Tipo_combustible, Modo_Movimiento);
        this.modelo = modelo;
        this.N_llantas = N_llantas;
        this.tipo = tipo;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getN_llantas() {
        return N_llantas;
    }

    public void setN_llantas(int N_llantas) {
        this.N_llantas = N_llantas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void moverse() {
        System.out.println("La moto se mueve por cerros y calles");

    }

    @Override
    public void acelerar() {
        System.out.println("Acelera rápidamente de 0 a 70 Km/h");
    }

}
