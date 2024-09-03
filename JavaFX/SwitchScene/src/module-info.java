module SwitchScene {
	requires javafx.controls;
	requires javafx.fxml;    //FXML설정
	requires javafx.graphics;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
}
