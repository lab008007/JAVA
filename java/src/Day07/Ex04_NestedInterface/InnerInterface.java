package Day07.Ex04_NestedInterface;

public class InnerInterface {

	public static void main(String[] args) {
		
		I i = new I();
		
		//구현 캑체를 메소드를 통해 지정
		i.setInterface(new K());
		i.method();
	}
	
}
