
public class StudentController<StudentView> {

	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	public void setStudentName(String name) {
		model.setName(name);
		
	}
	public String getStudentName(String name) {
		return model.getName();
	}
	
	
	
	
}
