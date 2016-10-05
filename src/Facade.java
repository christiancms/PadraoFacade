
public class Facade {
	Camera cam;
	Contact cont;
	Notification noti;
	
	Facade(){
		cam = new Camera();
		cont = new Contact();
		noti = new Notification();
	}
	
	public void criarContato(){
		System.out.println("FACADE: criarContato");
		cont.newContact();
	}
	
	public void foto(){
		System.out.println("FACADE: foto");
		cam.takePicture();
	}
	
	public void notificar(){
		System.out.println("FACADE: notificar");
		noti.pushNotification();
	}
}
