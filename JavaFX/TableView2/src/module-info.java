module TableView {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	
	opens application to javafx.base, javafx.graphics, javafx.fxml;
}





//module TableView2 {
//	requires javafx.controls;
//	
//	opens application to javafx.graphics, javafx.fxml;
//}
