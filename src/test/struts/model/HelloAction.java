package test.struts.model;

public class HelloAction {
	
	public String execute() {
		System.out.println("MVC - Model action class");
		return "success"; //�׼��� ���� - ��Ʈ�ѿ��� ��� �ڵ鸵�ϱ� ����. 
		//success, error, login(-�α��ν���), none(-ȭ�����) ���� ���ϰ��� ����
	}
}
