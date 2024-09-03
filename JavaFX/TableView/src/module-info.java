module TableView {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	
	opens application to javafx.base, javafx.graphics, javafx.fxml;
}






//module TableView {
//	requires javafx.controls;
//	requires javafx.fxml;
//	
//	opens application to javafx.graphics, javafx.fxml;
//}
