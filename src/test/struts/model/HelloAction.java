package test.struts.model;

public class HelloAction {
	
	public String execute() {
		System.out.println("MVC - Model action class");
		return "success"; //액션이 끝남 - 컨트롤에서 모두 핸들링하기 때문. 
		//success, error, login(-로그인실패), none(-화면없음) 등의 리턴값이 있음
	}
}
