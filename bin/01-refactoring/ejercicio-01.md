<p align="center">
  <strong>REFACTORING</strong>
</p>

---

### Ejercicio 1: Algo huele mal.

Indique qué malos olores se presentan en los siguientes ejemplos.     
 
<u>1.1 Protocolo de Cliente</u>

La clase Cliente tiene el siguiente protocolo. ¿Cómo puede mejorarlo?  
 
```
/**  
* Retorna el límite de crédito del cliente 
*/ 

public double lmtCrdt() {... 
 
/* Retorna el monto facturado al cliente desde la fecha f1 a la fecha f2 */ 
protected double mtFcE(LocalDate f1, LocalDate f2) {...} 
 
/*  
Retorna el monto cobrado al cliente desde la fecha f1 a la fecha f2 
*/ 
private double mtCbE(LocalDate f1, LocalDate f2) {...}
```
---

### Respuesta:

* bad smels presentes en el código dado: <strong>Uncommunicative Name (Nombre no Comunicativo) </strong>

### Solución propuesta:
---

```
/*  
 Retorna el límite de crédito del cliente 
*/ 

public double limiteCreditoCliente() {...} 
 
/* Retorna el monto facturado al cliente desde la fecha f1 a la fecha f2 */ 

protected double mtFcE(LocalDate f1, LocalDate f2) {...} 
 
/*  
Retorna el monto cobrado al cliente desde la fecha f1 a la fecha f2 
*/ 
private double mtCbE(LocalDate f1, LocalDate f2) {...}
```
```



