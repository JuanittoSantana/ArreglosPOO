package arreglospoo;

public class Carro extends Vehículo {

    int N_llantas;
    int n_Cilindros;
    int N_puertas;

    public Carro(){
        
    }
    public Carro(int N_llantas, int n_Cilindros, int N_puertas, String volante, String Tipo_combustible, String Modo_Movimiento) {
        super(volante, Tipo_combustible, Modo_Movimiento);
        this.N_llantas = N_llantas;
        this.n_Cilindros = n_Cilindros;
        this.N_puertas = N_puertas;
    }

    public int getN_llantas() {
        return N_llantas;
    }

    public void setN_llantas(int N_llantas) {
        this.N_llantas = N_llantas;
    }

    public int getN_Cilindros() {
        return n_Cilindros;
    }

    public void setN_Cilindros(int n_Cilindros) {
        this.n_Cilindros = n_Cilindros;
    }

    public int getN_puertas() {
        return N_puertas;
    }

    public void setN_puertas(int N_puertas) {
        this.N_puertas = N_puertas;
    }
    @Override
    public void moverse() {
        System.out.println("El carro se mueve en las carreteras y terracerias");

    }

    @Override
    public void acelerar() {
        System.out.println("Acelera de 0 a 10 Km/h");
    }

}
