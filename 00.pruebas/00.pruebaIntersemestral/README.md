# Feedback general de la Prueba Intersemestral

En este documento se resumen los fallos más importantes detectados en los exámenes.

### Denominación de atributos/argumentos

```java
metodo(String _atributo)
{
	atributo = _atributo;
}
```

```java
void AddPersona()
{
	....
}
```

### ¿Tiene sentido una clase con un solo atributo o sin ellos?

Un objeto puede tener sentido por su información o por su comportamiento. Puede no tener atributos y poseer un comportamiento que justifique su existencia (sobre todo en la redefinición de funcionalidad en herencia)

```java
class Clase
{
	String atributo;
}
```

```java
class Clase
{
	
}
```

### Incremento decremento de variables

Para incrementar variables...
```java
numRelacionados = numRelacionados + 1
```
...también se puede utilizar esta expresión:
```java
numRelacionados++;
```

### Cálculo de valores no son atributos

Resultados de métodos no se guardan como atributos:

```java
int resultado;

void setResultado()
{
	resultado = a + b + c;
}
```

Se deben calcular al vuelo:

```java
int setResultado()
{
	int resultado = a + b + c;
	return resultado;
	//return a + b + c;
}
```

### Código fácil de leer

Debemos leer claramente el código:

```java
public class Persona
{
	int edad; String nombre; Persona relacionados[];String dni;
}
```

### Devolución de métodos útil

Intentaremos devolver objetos útiles para que puedan ser procesados desde el objeto consumidor:

Mal código:
```java
public String buscarPersona(int dni)
{
	....
	return p.toString();
}
```

Mal código:
```java
public String buscarPersona(int dni)
{
	....
	return "ERROR, no se encontró";
}
```

Buen código:
```java
public Persona buscarPersona(int dni)
{
	....
	return p;
}
```

Buen código:
```java
public boolean buscarPersona(int dni)
{
	....
	return false;
}
```

### Varios
- Descomponer los casos particulares en clases nos permite indentificar mejor la funcionalidad y escalar. El examen es solo un ejemplo puntual forzado a ello.
- *interface* vs interfaz del objeto
- El método getInfo() ya no se debe utilizar.