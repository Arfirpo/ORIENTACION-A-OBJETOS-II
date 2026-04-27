Ejercicio 2: Iteradores circulares  
 
Dada la siguiente implementación: 
 
CharRing.java 
 ```
 1   public class CharRing extends Object { 
 2      char[] source; 
 3      int idx; 
 4   
 5      public CharRing(String srcString) { 
 6          char result; 
 7          source = new char[srcString.length()]; 
 8          srcString.getChars(0, srcString.length(), source, 0); 
 9          result = 0; 
10          idx = result; 
11      } 
12   
13      public char next() { 
14          int result; 
15          if (idx >= source.length) 
16              idx = 0; 
 
17          result = idx++; 
18          return source[result]; 
19      } 
20  } 
 ```
Tareas: 
1)  Se quiere aplicar el refactoring Rename Variable sobre la variable result que se usa 
en la línea 18 con el nuevo nombre currentPosition. 
2)  ¿Cómo queda el código final y qué inconveniente se podría encontrar?
 ---

 ### Respuesta:

 