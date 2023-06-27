package section19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * InputStream / OutputStream
 * 	바이트 기반 입력과 출력을 다루는 추상 클래스이다.
 * 
 * FileInputStream
 * 	파일을 바이트 단위로 순차적으로 읽는 객체
 * 
 * FileOutputStream
 * 	파일을 바이트 단위로 순차적으로 쓰는 객체
 * 
 * 
 */
public class IO04 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// hello.txt 파일을 읽기 위한 객체
			fis = new FileInputStream("./upload/hello.txt");
			
			File f1 = new File("./upload2");
			if(f1.mkdir()) {	// 경로에 depth가 있어 하위 디렉토리가 있을때 mkdirs() 사용
				System.out.println("upload2 디렉토리가 생성되었습니다.");
			}
			
			// 빈 hello2.txt 파일 생성
			File f2 = new File(f1, "hello2.txt");	
			if(f2.createNewFile()) {
				System.out.println("hello2.txt 파일이 생성되었습니다.");
			}
			
			// FileOutputStream 경로에 디렉토리는 존재해야하며, 없으면 에러
			// 파일은 경로에 존재하지 않을 시 자동으로 생성해준다.
			fos = new FileOutputStream(f2);
			// fos = new FileOutputStream("./upload2/hello2.txt");
			
			int readByteCnt = 0;
			byte[] b = new byte[100];
			while((readByteCnt = fis.read(b)) != -1) {	// readByteCnt = fis.read(b) 100byte 씩 파일에서 읽어옴, 읽을게 없으면 -1 반환
				fos.write(b, 0, readByteCnt);	//(
			}
			
			System.out.println("파일 복사 완료!");
			
			
			
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			if(fos != null) fos.close();
			if(fis != null) fis.close();
		}
	}
}
