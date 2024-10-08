package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Scene scene;
	
	@Override
	public void start(Stage stage) throws IOException {
		Parent root = loadFXML("Main");
		scene = new Scene(root, 600, 400);
		
		//키 이벤트 등록
		setEvent(scene, root);
		
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * Scene 의 컨테이너를 불러온 FXML 로 지정하는 메소드
	 * @param fxml
	 * @throws IOException
	 */
	static void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));
	}
	
	/**
	 * FXML 파일 읽어오는 메소드
	 * @param fxml
	 * @return
	 * @throws IOException
	 */
	private static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
		return fxmlLoader.load();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/**
	 * 키보드로 도형을 이동시키는 이벤트 등록
	 * @param scene
	 */
	public void setEvent(Scene scene, Parent root) {
		Circle circle = (Circle) root.lookup("#circle");
		if( circle != null ) {
			System.out.println("원의 반지름 : " + circle.getRadius());;
		}
		else {
			System.err.println("원을 찾을 수 없습니다.");
			return;
		}
		
		//키 입력 이벤트 등록
		scene.setOnKeyPressed( event -> {
			double x = circle.getCenterX();  //원의 중심 x 좌표
			double y = circle.getCenterY();  //원의 중심 y 좌표
			
			switch( event.getCode()) {    //event.getCode() : 입력한 키의 코드 값
			case UP:
				System.out.println("UP");
				circle.setCenterY( y -= 10);
				break;
			case DOWN:
				System.out.println("DOWM");
				circle.setCenterY( y += 10);
				break;
			case LEFT:
				System.out.println("LEFT");
				circle.setCenterX( x -= 10);
				break;
			case RIGHT:
				System.out.println("RIGHT");
				circle.setCenterX( x += 10);
				break;
			}
		});
		
		
	}
	
}