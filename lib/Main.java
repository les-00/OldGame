import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Main extends Application{

	static double xEnd = 0.0;
	static double yEnd = 0.0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane root =new Pane();
		
		
		Line l = new Line(100,100,120,100);
		xEnd = 120;
		yEnd = 100;
		root.getChildren().add(l);
		
		
		Scene scene = new Scene(root, 600,650,Color.ALICEBLUE);
		
		
		//Handle events
		scene.setOnKeyPressed(e ->
		{
			Line l2 = new Line();
			if(e.getCode() == KeyCode.LEFT)
			{
				System.out.println("left");
				
				
				
				l2.setStartX(xEnd);
				l2.setStartY(yEnd);
				l2.setEndX(xEnd - 20);
				l2.setEndY(yEnd);
				xEnd -=20;
			}
			else if(e.getCode() == KeyCode.RIGHT)
			{
				System.out.println("right");
				
				l2.setStartX(xEnd);
				l2.setStartY(yEnd);
				l2.setEndX(xEnd + 20);
				l2.setEndY(yEnd);
				xEnd +=20;
			}
			else if(e.getCode() == KeyCode.DOWN)
			{
				System.out.println("down");
				
				l2.setStartX(xEnd);
				l2.setStartY(yEnd);
				l2.setEndX(xEnd);
				l2.setEndY(yEnd+20);
				yEnd +=20;
			}
			else if(e.getCode() == KeyCode.UP)
			{
				System.out.println("up");
				l2.setStartX(xEnd);
				l2.setStartY(yEnd);
				l2.setEndX(xEnd);
				l2.setEndY(yEnd-20);
				yEnd -=20;
			}
			
			root.getChildren().add(l2);
		});
		
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Drawing Lines");
		primaryStage.show();
	}
	
	
	
	

}
