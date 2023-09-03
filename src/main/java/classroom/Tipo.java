package classroom;

public enum Tipo {
	
	DISCIPLINAR(10, "DISCIPLINAR"), FUNDAMENTACION(20, "FUNDAMENTACION"), ELECTIVA(30, "ELECTIVA");
	
	private int codigo;
	private String nombre;
	
	private Tipo(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
