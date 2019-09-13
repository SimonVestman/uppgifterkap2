/*
Uppgift 2.1 i boken sida 34
Skapad 2019 09 13
Av simon Vestman
*/

import	javax.swing.*;

public class uppgift2_1{
	public static void main(String[] args) {
		String namn;
		String adress;
		String tfnr;
		String allt;
		
		namn = "Simon Vestman";
		adress = "Vastamarken78";
		tfnr = "0730735029";
		allt = namn + 
				"\n"+ adress +
					"\n" + tfnr;
		
		
		JOptionPane.showMessageDialog(null,allt);
	}
}
