package application;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController{
	
	@FXML
	private Button button;
	
	// 버튼 클릭 이벤트 메소드
	public void clickButton(ActionEvent event) throws IOException{
		System.out.println("버튼 클릭!");
	}
	
}