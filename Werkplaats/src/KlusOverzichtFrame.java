import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class KlusOverzichtFrame extends Hoofdmenu implements ActionListener{

	public KlusOverzichtFrame(Bedrijf b){
		super(b);
		setTitle("AutoTotaalDiensten - Overzicht van klussen");
	}
}
