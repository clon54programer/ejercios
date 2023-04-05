## Conversion de int a String

```java
String Cadena = Integer.toString(entero);// este convierte el int a String

```
[este es el archivo](CuentaCifraApp.java)

## convertir de string a ASSCII

```java
for (int i = 0; i < cadena.length(); i++) {
            // Hacemos un casting para convertir el char a int
            System.out.print((int) cadena.charAt(i) + " ");
        }
```