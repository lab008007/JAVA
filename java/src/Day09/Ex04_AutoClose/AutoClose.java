package Day09.Ex04_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class AutoClose {

	public static void main(String[] args) {
		
		
		
		try (
			FileInputStream fis = new FileInputStream("test.txt");
			InputStreamReader in = new InputStreamReader(fis, "UTF-8");
				)
		{
			
			int read = 0;
			
			while( (read = in.read() ) != -1) {    //IOException
				System.out.print( (char) read );
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (UnsupportedEncodingException e ) {
			e.printStackTrace();
			System.err.println("지원하지 않는 인코딩 타입입니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("입출력 관련 예외 발생");
		}
		//자원 해제 코드
//		finally {
//			if( fis != null ) {
//				try {
//					fis.close();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//
//		}
//		
	}
	
}
