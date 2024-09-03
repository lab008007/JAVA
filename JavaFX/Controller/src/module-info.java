module Controller {
	requires javafx.controls;
	requires javafx.fxml;    //FXML설정
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
