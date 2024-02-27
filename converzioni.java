package it.edu.iis.gubbio.convertitore;

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

	
	TextField tNumConv = new TextField();
	TextField tBasConv = new TextField();

	
	
	public void start(Stage finestra) {
		GridPane griglia = new GridPane();
		Scene scena = new Scene(griglia);

		griglia.add(lConvertitore, 0, 0,2,1);
		griglia.add(lNumConv, 0, 1);
		griglia.add(tNumConv, 1, 1);
		griglia.add(lBasConv, 0, 2);
		griglia.add(tBasConv, 1, 2);
		griglia.add(lNumConvert, 0, 3);
		griglia.add(lRis, 1, 3);
		griglia.add(bCalcola, 0,4);

		griglia.setHgap(10);
		griglia.setVgap(10);
		griglia.setPadding(new Insets(10));
		lConvertitore.setPadding(new Insets(10,100,10,100));
		
		
		finestra.setScene(scena);
		finestra.setTitle("convertitore");
		finestra.show();

		bCalcola.setOnAction(e -> calcola());
	}

	public void calcola() {
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

