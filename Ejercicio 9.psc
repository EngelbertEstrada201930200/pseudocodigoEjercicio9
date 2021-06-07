Algoritmo temperaturaE9
	Definir t1, t2 Como Entero
	Definir s1, s2, c1, c2 Como Entero

	s1=0
	s2=0
	Escribir "ingrese (T1 y T2)"
	leer t1
	leer t2
	
	Mientras t1>0 hacer
		
		Si t1>=5 & t1<=15 Entonces
			s1 = s1+t1
			c1= c1+1
			
		Fin Si
		
		Si t2>=5 & t2<=15 Entonces
			s2 = s2+t2
			c2= c2+1
		Fin Si
		
		Escribir "ingrese (T1 y T2)"
		leer t1
		leer t2
	Fin Mientras
	
	Escribir "El promedio de T1 es " s1/c1
	Escribir "El promedio de T2 es " s2/c2
FinAlgoritmo
