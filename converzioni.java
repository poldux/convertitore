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
	Label lRis = new Label("ciao");
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
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
