package it.edu.iis.gubbio.convertitore;

import java.util.Hashtable;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class converzioni extends Application {

	Label lConvertitore = new Label("CONVERTITORE");
	Label lNumConv = new Label("Numero da convertire");
	Label lBasConv = new Label("Base di converzione ");
	Label lNumConvert = new Label("Numero convertito");
	Label lRis = new Label(" ");
	Button bCalcola = new Button("converti");

	TextField tNum = new TextField();
	TextField tBasConvIn = new TextField();
	TextField tBasConvOut = new TextField();
	Hashtable<Integer, Character> c = new Hashtable<>();

	public void start(Stage finestra) {
		GridPane griglia = new GridPane();
		Scene scena = new Scene(griglia);

		griglia.add(lConvertitore, 0, 0, 2, 1);
		griglia.add(lNumConv, 0, 1);
		griglia.add(tNum, 1, 1);
		griglia.add(lBasConv, 0, 2);
		griglia.add(tBasConvIn, 1, 2);
		griglia.add(tBasConvOut, 1, 3);
		griglia.add(lNumConvert, 0, 3);
		griglia.add(lRis, 1, 4);
		griglia.add(bCalcola, 0, 4);

		griglia.setHgap(10);
		griglia.setVgap(10);
		griglia.setPadding(new Insets(10));
		lConvertitore.setPadding(new Insets(10, 100, 10, 100));

		finestra.setScene(scena);
		finestra.setTitle("convertitore");
		finestra.show();

		bCalcola.setOnAction(e -> calcola());
	}

	public void calcola() {
<<<<<<< HEAD
		int valore = Integer.parseInt(tNum.getText());
		int base = Integer.parseInt(tBasConvIn.getText());
		Hashtable<Integer, String> my_dict = new Hashtable<Integer, String>();
		String m = "";
		int resto = 0;

		my_dict.put(10, "A");
		my_dict.put(11, "B");
		my_dict.put(12, "C");
		my_dict.put(13, "D");
		my_dict.put(14, "E");
		my_dict.put(15, "F");
		if (base == 16) {
			while (valore > 0) {
				resto = valore;
				valore = valore / base;
				resto = resto - (valore * base);
				if (resto < 10) {
					m = resto + m;
				}
				if ( resto == 10) {
					 my_dict.get(10);
				 }
				 if ( resto == 11) {
					 my_dict.get(11);
				 }
				 if ( resto == 12) {
					 my_dict.get(12);
				 }
				 if ( resto == 13) {
					 my_dict.get(13);
				 }
				 if ( resto == 14) {
					 my_dict.get(14);
				 }
				 if ( resto == 15) {
					 my_dict.get(15);
				 }
			}
		} else {
			while ( valore > 0) {
				resto = valore; 
				valore = valore / base;
				resto = resto - (valore * base);
				m = resto + m; 
			}
		}
	}
=======
		int valore= Integer.parseInt(tNumConv.getText());
		int base= Integer.parseInt(tBasConv.getText());

		int Resto=0;
		String s= "";

		if(base == 16) {

		while(valore > 0) {

		Resto= valore;

		valore= valore / base;

		Resto= Resto-(valore*base);

		if( Resto < 10 ) {

		s= Resto+s;

		}
>>>>>>> 95ec7d43f0cbff572edd9c41810a29e0c33cadc3

		if(Resto == 10) {

		s="A"+s;

		}
		if(Resto == 11) {

		s="B"+s;

		}
		if(Resto == 12) {

		s="C"+s;

		}
		if(Resto == 13) {

		s="D"+s;

		}
		if(Resto == 14) {

		s="E"+s;

		}
		if(Resto == 15) {

		s="F"+s;

		}

		}

		}else {

		while(valore > 0) {

		Resto= valore;

		valore= valore / base;

		Resto= Resto-(valore*base);

		s= Resto+s;

		}

		}





		lRis.setText(s);
		}
	
 
	public static void main(String[] args) {
		launch(args);
	}
}
