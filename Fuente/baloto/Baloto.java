/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloto;

/**
 *
 * @author usuario
 */
public class Baloto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//Para rifar el numero
        Random baloto = new Random();
        int [] n = new int [6];
	int [] nBaloto = new int [6];
	int [] nIngresado = new int [6];
	int numrifado;
	    //Bolsa de premios
	double granPremio = 1.000.000.000;
	    //30% por si acierta en tres numeros
	double pago1 = granPremio*(0.3);
	    //60% por si acierta en cinco numero
 	double pago2 = granPremio*(0.6);
	    //100% por si acierta en todos
	double pago3 = granPremio;
	    
	for (int i =0; i<6;i++){
	     nIngresado[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero de dos cibras:"+(i+1)));
	     numrifado = (int) (math.random() * 45+1);
	     nBaloto[i] = numrifado;
	}
	    //Si acierta en tres numeros 
	if (Ingresado[5] == nBaloto[0] && nIngresado [4] == nBaloto[1] && nIngresado[3] == nBaloto[2]){
	    System.out.println("¡Felicidades!, Usted se ganó:"+pago1);
	    System.out.println("Usted acertó en tres numeros");	
	   //Si acierta en 5 numeros 
	}else if (nIngresado[5] == nBaloto[0] && nIngresado [4] == nBaloto[1]){
	}
    }
    
}
