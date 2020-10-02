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
	double granPremio = 1.000.000.000;
	double pago2 = granPremio*(0.6);
	double pago3 = granPremio;
	for (int i =0; i<6;i++){
	     nIngresado[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero de dos cibras:"+(i+1)));
	     numrifado = (int) (math.random() * 45+1)
	}
    }
    
}
