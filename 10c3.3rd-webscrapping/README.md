# Utilización de librerías de terceros

## Jsoup como librería para Webscraping y JFreeChart para generación de gráficos

### Compilación
#### Windows
```java
javac -cp .;jcommon-1.0.23.jar;jfreechart-1.0.19.jar;jsoup-1.13.1.jar covid19\JVentana.java 
```
#### Linux o Mac
```java
javac -cp .:jcommon-1.0.23.jar:jfreechart-1.0.19.jar:jsoup-1.13.1.jar covid19/JVentana.java 
```

### Ejecución

#### Windows

```java
java -cp .;jcommon-1.0.23.jar;jfreechart-1.0.19.jar;jsoup-1.13.1.jar covid19.JVentana 
```
#### Linux o Mac

```java
java -cp .:jcommon-1.0.23.jar:jfreechart-1.0.19.jar:jsoup-1.13.1.jar covid19.JVentana 
```