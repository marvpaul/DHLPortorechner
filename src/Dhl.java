import javax.swing.*;
public class Dhl {
	public static void main(String[] args){
		int zahlenfeld [] = new int [3];
		int paeckchen; 
		boolean paeckchenb ;
		double gewicht;
		zahlenfeld[0] = Integer.parseInt((JOptionPane.showInputDialog("Bitte geben Sie die LŠnge ihres Paketes in cm an!"))); //Werte einlesen 
		zahlenfeld[1] = Integer.parseInt((JOptionPane.showInputDialog("Bitte geben Sie die Breite ihres Paketes in cm an!")));
		zahlenfeld[2] = Integer.parseInt((JOptionPane.showInputDialog("Bitte geben Sie die Hšhe ihres Paketes  in cm an!")));
		paeckchen = JOptionPane.showConfirmDialog(null, "Wollen Sie als PŠckchen versenden?", "Message",
		        JOptionPane.YES_NO_OPTION);
		gewicht = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie das Gewicht ein! Ein Komma sollte als Punkt geschrieben werden"));
		if (paeckchen == 0){ //Die JOptionPane Abfrage nach dem PŠckchen in Wahrheitswert umwandeln
			paeckchenb = true;
		}
		else
			paeckchenb = false;
		int hilfe; //Zwischenspeicher beim Tauschen
		 for (int j = 0; j < zahlenfeld.length-j; j++){ 
			 for (int i = 0; i < zahlenfeld.length-1; i++){ //Durchlauf des Feldes - Abstand
				 if (zahlenfeld[i] < zahlenfeld[i+1]){ //Wenn VorgŠnger grš§er ist dann wird getauscht --> Am Ende des Durchlaufs kleinste Zahl an zahlenfeld.length-j
					 hilfe = zahlenfeld[i]; //Tausch
					 zahlenfeld[i] = zahlenfeld[i+1];
					 zahlenfeld[i+1] = hilfe;
				 }
				 
			 }
			 
		 }
		 if (gewicht <= 2 && zahlenfeld[0] <= 60 && zahlenfeld[1] <= 30 && zahlenfeld[2] <= 15 && paeckchenb == true){ //Entscheidung nach dem Ausschlussverfahren
				JOptionPane.showMessageDialog(null, "Sie kšnnen als PŠckchen versenden! Der Versand kostet Online 3,99Û");
			}
		 else if (gewicht <= 2 && zahlenfeld[0] <= 60 && zahlenfeld[1] <= 30 && zahlenfeld[2] <= 15 && paeckchenb == false){
				JOptionPane.showMessageDialog(null, "Sie kšnnen als Paket bis 2 kg versenden! Der Versand kostet Online 4,99Û");
			}
		 else if (gewicht <= 10 && zahlenfeld[0] <= 120 && zahlenfeld[1] <= 60 && zahlenfeld[2] <= 60){
			 JOptionPane.showMessageDialog(null, "Sie kšnnen als Paket bis 10 kg versenden! Der Versand kostet Online 5,99Û");
		 }
		 else if (gewicht <= 20 && zahlenfeld[0] <= 120 && zahlenfeld[1] <= 60 && zahlenfeld[2] <= 60){
			 JOptionPane.showMessageDialog(null, "Sie kšnnen als Paket bis 20 kg versenden! Der Versand kostet Online 10,99Û");
		 }
		 else if (gewicht <= 31.5 && zahlenfeld[0] <= 120 && zahlenfeld[1] <= 60 && zahlenfeld[2] <= 60){
			 JOptionPane.showMessageDialog(null, "Sie kšnnen als Paket bis 31,5 kg versenden! Der Versand kostet Online 12,99Û");
		 }
		 else{
			 JOptionPane.showMessageDialog(null, "Ihr Paket kann leider nicht mit DHL verschickt werden da es zu gro§ oder zu schwer ist!");
		 }
	 }
	
	
	
	
}
