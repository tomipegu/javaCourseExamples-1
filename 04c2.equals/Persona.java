/*
 Esta clase define el comportamiento de objetos Persona
*/

public class Persona
{
	final static int EDAD_MIN = 0;
	final static int EDAD_MAX = 130;
	final static int MAYORIA_DE_EDAD = 18;

	//Atributos de Clase
	static String CIUDAD;

	//atributos
	String nombre;
	int edad;

	//Constructores

	Persona(String nombre, int edad)
	{
		//this.nombre = nombre;
		//this.edad = edad;
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	//Métodos de clase

	static String getCIUDAD()
	{
		return CIUDAD;
	}


	static void setCIUDAD(String _CIUDAD)
	{
		CIUDAD = _CIUDAD;
	}


	//métodos
	String getNombre()
	{
		return nombre;
	}

	int getEdad()
	{
		return edad;
	}

	void setNombre(String nombre)
	{
		this.nombre = nombre.toUpperCase();
	}

	void setEdad(int edad) //en un futuro este método deberá lanzar un error en la validación
	{
		if(edad >=EDAD_MIN && edad < EDAD_MAX)
			this.edad = edad;
	}

	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Persona)
		{
			Persona p = (Persona) o;
			return (this.nombre.equals(p.getNombre()) && this.edad == p.getEdad());
		}
		else
			return false;
	}

	@Override
	public String toString()
	{
		return "\n===========" + 
		"\nNombre: " + nombre +
		"\nEdad: " + edad + 
		"\nCIUDAD: " + CIUDAD;
	}
}