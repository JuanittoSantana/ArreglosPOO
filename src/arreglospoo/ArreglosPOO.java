package arreglospoo;

/*
EL PROGRAMA DE ARREGLOS UNIDIMENSIONALES LLENANDOLOS CON UNA SUBCLASE Y UNA SUPER CLASE
 */

public class ArreglosPOO {

    public static void main(String[] args) {

        // Al instanciar una clase donde se utilicen arreglos, se tendrán que instanciar con corchetes especificando la longitud 
        //deseada para el arreglo
        Moto[] moto = new Moto[2];
        Carro[] carro = new Carro[2];

        // Llenando los datos de la clase carro y moto, con arreglos utilizando los métodos Set 
        
        // GUARDAR EN LA CLASE MOTO
        
        moto[0] = new Moto();
        moto[0].setTipo("Carreras");
        moto[0].setModelo("2000");
        moto[0].setModo_Movimiento("Por tierra");
        moto[0].setN_llantas(2);
        moto[0].setTipo_combustible("Gasolina");
        moto[0].setVolante("Cuernos");
      //  moto[0].moverse();
      //  moto[0].acelerar();
      
        moto[1] = new Moto();
        moto[1].setTipo("Cuatrimoto");
        moto[1].setModelo("1998");
        moto[1].setModo_Movimiento("Por tierra");
        moto[1].setN_llantas(3);
        moto[1].setTipo_combustible("Gasolina");
        moto[1].setVolante("Cuernos");
     //   moto[1].moverse();
     //   moto[1].acelerar();

       
     
        //Mostrando los datos del arreglo moto
        for(int i=0; i<moto.length; i++){
            System.out.println(moto[i].getTipo()+" "+moto[i].getModelo()+" "+moto[i].getModo_Movimiento()+""
                    + " "+moto[i].getVolante()+""+moto[i].getN_llantas()+" "+moto[i].getTipo_combustible());
        }
    }

}
