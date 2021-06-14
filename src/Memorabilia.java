package src;

import java.util.*;

public class Memorabilia{
	
	public static void main(String[] args){
		
		Memorabilia ej = new Memorabilia();
	}
	
	Scanner scanner = new Scanner(System.in);
	//Datos clientes
	int[] id = new int[25];
	String[] nombres = new String[25];
	int[] telefono = new int[25];
	
	//Datos peliculas	
	int[] idp = new int[25];
	String[] nombresp = new String[25];
	int[] aniop = new int[25];
	String[] accionp = new String[25]; 
	int[] idpi = new int[25];
	String[] nombrespi = new String[25];
	int[] aniopi = new int[25];
	String[] infantilpi = new String[25];
	int[] idpm = new int[25];
	String[] nombrespm = new String[25];
	int[] aniopm = new int[25];
	String[] miedopm = new String[25];
	int[] idpa = new int[25];
	String[] nombrespa = new String[25];
	int[] aniopa = new int[25];
	String[] amorpa = new String[25];
	
	//Constructor
	public Memorabilia(){
		

		System.out.println("\n-----Bienvenidos a Memorabilia.-----\n\nSu mejor opcion al momento de alquilar peliculas, sera un gusto atenderle!!!");
		
		int opcion;
		
		do{
			System.out.println("\n-----Menu principal-----");
			System.out.println("\n1. Prestamo de peliculas.");
			System.out.println("2. Devolucion de peliculas.");
			System.out.println("3. Mostrar peliculas.");
			System.out.println("4. Ingreso de peliculas.");
			System.out.println("5. Ingresar nuevo cliente.");
			System.out.println("6. Mostrar clientes.");
			System.out.println("7. Reportes de la tienda");
			System.out.println("8. Salir");
			
			System.out.print("\nDigite la opcion que desee: ");
			opcion = scanner.nextInt();
			
			switch(opcion){
				case 1:	
					
					break;
				case 2:	
					break;
				case 3:
					mostrarPeliculas();				
					break;
				case 4:	
					ingresarPeliculas();
					break;
				case 5:	
					ingresarIdClientes();
					break;
				case 6:	
					mostrarClientes(id, nombres, telefono);	
					break;
				case 7:	
					mostrarReportes();
					break;
				case 8:	
					break;	
			}	
		}while(opcion!=8);
		System.out.println("\nGracias por utilizar el programa de Memorabilia");
	}

//Metodo booleano para saber si un ID de cliente ya existe		
	public boolean idIgual(int id, int arreglo[]){
		boolean igual = true;
		for(int i = 0; i<arreglo.length;i++){
			if(arreglo[i] == id){
				igual = false;
				break;
			}
		}
		return igual;
	}

//Metodo ingresa los datos del cliente	
	public void ingresarIdClientes(){
		int opcion = 2;
		int idAux;
		
		while((nombres[25-1]==null) && (opcion == 2)){
			System.out.print("\nIngrese el ID del cliente: ");
			idAux = scanner.nextInt();
			
			if(idIgual(idAux,id)){
				for(int i = 0; i<25;i++){
					if(nombres[i] == null){
						id[i] = idAux;
						ingresarNombreTelefono(i);
						break;
					}
				}
			}else{
				System.out.println("Este ID ya le pertenece a otro cliente.");
			}
			
			System.out.println("\n1. Regresar al menu principal.");
			System.out.println("2. Agregar otro cliente.");
			System.out.print("\nElija una opcion: ");
			opcion = scanner.nextInt();
		}		
	}
	
	Scanner scanner1 = new Scanner(System.in);
	public void ingresarNombreTelefono(int posicion){
		System.out.print("Ingrese el nombre del cliente: ");
		nombres[posicion] = scanner1.nextLine();
		System.out.print("Ingrese el telefono del cliente: ");
		telefono[posicion] = scanner.nextInt();
	}

//Metodo muestra a los clientes ingresados.	
	public void mostrarClientes(int[] id, String[] nombres, int[] telefono){
		for( int i =0; i< 25;i++){
			if(nombres[i] != null){
				System.out.println("\nId: "+id[i]+" ---Nombre: "+nombres[i]+" ---Telefono: "+telefono[i]+"\n");
			}
		}
	}

//Metodo muestra las peliculas ingresadas	
	public void mostrarPeliculas(){
		int opcioncategoria;
		
		do{
			System.out.println("\n-----Categoria de las Peliculas-----");
			System.out.println("\n1. Accion.");
			System.out.println("2. Infantil.");
			System.out.println("3. Miedo.");
			System.out.println("4. Amor.");
			System.out.println("5. Volver al menu principal.");
			
			System.out.print("\nIngrese la opcion que desee: ");
			opcioncategoria = scanner.nextInt();
			
			switch (opcioncategoria){
				case 1:	
					//ordenarPeliculasAccion(nombresp);
					mostrarPeliculasAccion(idp, nombresp, aniop, accionp);
					break;
				case 2:
					//ordenarPeliculasInfantil(nombrespi);
					mostrarPeliculasInfantil(idpi, nombrespi, aniopi, infantilpi);
					break;
				case 3:
					//ordenarPeliculasMiedo(nombrespm);
					mostrarPeliculasMiedo(idpm, nombrespm, aniopm, miedopm);
					break;
				case 4:
					//ordenarPeliculasAmor(nombrespa);
					mostrarPeliculasAmor(idpa, nombrespa, aniopa, amorpa);
					break;
				case 5:
					System.out.println("\nVolviendo al menu principal");
                    System.out.println("-");
                    System.out.println("-");
                    System.out.println("-\n");
					break;	
			}
		}while(opcioncategoria!=5);
	}

//Metodo ingresa las peliculas segun categoria
	public void ingresarPeliculas(){
		int opcioncategoria1;
		
		do{
			System.out.println("\n-----Menu de las categorias de las peliculas-----");
			System.out.println("\n1. Accion.");
			System.out.println("2. Infantil.");
			System.out.println("3. Miedo.");
			System.out.println("4. Amor.");
			System.out.println("5. Volver al menu principal.");
			
			System.out.print("\nIngrese la opcion que desee: ");
			opcioncategoria1 = scanner.nextInt();
			
			switch (opcioncategoria1){
				case 1:
					ingresarIdPeliculasAccion();
					break;
				case 2:
					ingresarIdPeliculasInfantil();
					break;
				case 3:
					ingresarIdPeliculasMiedo();
					break;
				case 4:
					ingresarIdPeliculasAmor();
					break;
				case 5:
					System.out.println("\nVolviendo al menu principal");
                    System.out.println("-");
                    System.out.println("-");
                    System.out.println("-\n");
					break;	
			}
		}while(opcioncategoria1!=5);
	}

//Metodo booleano para saber si un ID de Pelicula accion ya existe
	public boolean idpIgual(int idp, int arreglo[]){
		boolean igual = true;
		for(int i = 0; i<arreglo.length;i++){
			if(arreglo[i] == idp){
				igual = false;
				break;
			}
		}
		return igual;
	}
	
	public void ingresarIdPeliculasAccion(){
		int opcion = 2;
		int idpAux;
			
		while((nombresp[25-1]==null) && (opcion == 2)){
			System.out.print("\nIngrese el ID de la pelicula: ");
			idpAux = scanner.nextInt();
		
			if(idpIgual(idpAux,idp)){
				for(int i = 0; i<nombresp.length;i++){
					if(nombresp[i] == null){
						idp[i] = idpAux;
						ingresarNombreAccion(i);
						break;
					}
				}
			}else{
			System.out.println("Este ID ya le pertenece a otra pelicula de Accion.");
			}
			System.out.println("\n1. Regresar al menu principal.");
			System.out.println("2. Agregar otro cliente.");
			System.out.print("\nElija una opcion: ");
			opcion = scanner.nextInt();
		}		
	}
	
	Scanner scanner2 = new Scanner(System.in);
	public void ingresarNombreAccion(int posicion){
		System.out.print("Ingrese el nombre de la pelicula: ");
		nombresp[posicion] = scanner2.nextLine();
		System.out.print("Ingrese el anio de la pelicula: ");
		aniop[posicion] = scanner.nextInt();
		System.out.print("Ingrese la categoria de la pelicula: ");
		accionp[posicion] = scanner2.nextLine();
	}
		
	public void mostrarPeliculasAccion(int[] idp, String[] nombresp, int[] aniop, String[] accionp){
		for( int i =0; i<nombresp.length;i++){
			if(nombresp[i] != null){
			System.out.println("\nId: "+idp[i]+" ---Nombre: "+nombresp[i]+" ---Anio: "+aniop[i]+" ---Categoria: "+accionp[i]+"\n");
			}
		}	
	}

	/*public void ordenarPeliculasAccion(String[] nombresp){
	/*	int i, j;
		String aux;
		
		for(i = 1; i < nombresp.length; i++){
			j=i;
			aux = nombresp[i];
			while((j > 0) & ((aux) < (Integer.parseInt(nombresp[j-1])))){
				nombresp[j] = nombresp[j-1];
				j--;		
			}
			nombresp[j] = aux;
		}
	}
		
		
		for(int i=1; i<nombresp.length;i++){
			for(int j=0;j<nombresp.length-i;j++){
				if(nombresp[j].compareTo(nombresp[j+1])>0){
					String variableauxiliar=nombresp[j];
					nombresp[j]=nombresp[j+1];
					nombresp[j+1]=variableauxiliar;
				}
			}
		}
	}*/

//Metodo booleano para saber si un ID de Pelicula infantil ya existe
	public boolean idpiIgual(int idpi, int arreglo[]){
		boolean igual = true;
		for(int i = 0; i<arreglo.length;i++){
			if(arreglo[i] == idpi){
				igual = false;
				break;
			}
		}
		return igual;
	}
	
	public void ingresarIdPeliculasInfantil(){
		int opcion = 2;
		int idpiAux;
			
		while((nombrespi[25-1]==null) && (opcion == 2)){
			System.out.print("\nIngrese el ID de la pelicula: ");
			idpiAux = scanner.nextInt();
		
			if(idpiIgual(idpiAux,idpi)){
				for(int i = 0; i<nombrespi.length;i++){
					if(nombrespi[i] == null){
						idpi[i] = idpiAux;
						ingresarNombreInfantil(i);
						break;
					}
				}
			}else{
			System.out.println("Este ID ya le pertenece a otra pelicula Infantil.");
			}
			System.out.println("\n1. Regresar al menu principal.");
			System.out.println("2. Agregar otro cliente.");
			System.out.print("\nElija una opcion: ");
			opcion = scanner.nextInt();
		}		
	}
	
	Scanner scanner3 = new Scanner(System.in);
	public void ingresarNombreInfantil(int posicion){
		System.out.print("Ingrese el nombre de la pelicula: ");
		nombrespi[posicion] = scanner3.nextLine();
		System.out.print("Ingrese el anio de la pelicula: ");
		aniopi[posicion] = scanner.nextInt();
		System.out.print("Ingrese la categoria de la pelicula: ");
		infantilpi[posicion] = scanner3.nextLine();
	}
		
	public void mostrarPeliculasInfantil(int[] idp, String[] nombrespi, int[] aniopi, String[] accionpi){
		for( int i =0; i<nombrespi.length;i++){
			if(nombrespi[i] != null){
			System.out.println("\nId: "+idpi[i]+" ---Nombre: "+nombrespi[i]+" ---Anio: "+aniopi[i]+" ---Categoria: "+accionpi[i]+"\n");
			}
		}	
	}

	/*public void ordenarPeliculasInfantil(String[] nombrespi){
		for(int i=0; i<nombrespi.length-1;i++){
			for(int j=i+1;j<nombrespi.length;j++){
				if(nombrespi[j] != null){
				if(nombrespi[i].compareToIgnoreCase(nombrespi[j])>0){
					String variableauxiliar=nombrespi[i];
					nombrespi[i]=nombrespi[j];
					nombrespi[j]=variableauxiliar;
				}
				}
			}
		}
	}*/
	
//Metodo booleano para saber si un ID de Pelicula miedo ya existe	
	public boolean idpmIgual(int idpm, int arreglo[]){
		boolean igual = true;
		for(int i = 0; i<arreglo.length;i++){
			if(arreglo[i] == idpm){
				igual = false;
				break;
			}
		}
		return igual;
	}
	
	public void ingresarIdPeliculasMiedo(){
		int opcion = 2;
		int idpmAux;
			
		while((nombrespm[25-1]==null) && (opcion == 2)){
			System.out.print("\nIngrese el ID de la pelicula: ");
			idpmAux = scanner.nextInt();
		
			if(idpmIgual(idpmAux,idpm)){
				for(int i = 0; i<nombrespm.length;i++){
					if(nombrespm[i] == null){
						idpm[i] = idpmAux;
						ingresarNombreMiedo(i);
						break;
					}
				}
			}else{
			System.out.println("Este ID ya le pertenece a otra pelicula de Miedo.");
			}
			System.out.println("\n1. Regresar al menu principal.");
			System.out.println("2. Agregar otro cliente.");
			System.out.print("\nElija una opcion: ");
			opcion = scanner.nextInt();
		}		
	}
	
	Scanner scanner4 = new Scanner(System.in);
	public void ingresarNombreMiedo(int posicion){
		System.out.print("Ingrese el nombre de la pelicula: ");
		nombrespm[posicion] = scanner4.nextLine();
		System.out.print("Ingrese el anio de la pelicula: ");
		aniopm[posicion] = scanner.nextInt();
		System.out.print("Ingrese la categoria de la pelicula: ");
		miedopm[posicion] = scanner4.nextLine();
	}
		
	public void mostrarPeliculasAmor(int[] idpm, String[] nombrespm, int[] aniopm, String[] miedopm){
		for( int i =0; i<nombrespm.length;i++){
			if(nombrespm[i] != null){
			System.out.println("\nId: "+idpm[i]+" ---Nombre: "+nombrespm[i]+" ---Anio: "+aniopm[i]+" ---Categoria: "+miedopm[i]+"\n");
			}
		}	
	}	

	/*public void ordenarPeliculasMiedo(String[] nombrespm){
		for(int i=0; i<nombrespm.length-1;i++){
			for(int j=i+1;j<nombrespm.length;j++){
				if(nombrespm[i].compareToIgnoreCase(nombrespm[j])>0){
					String variableauxiliar=nombrespm[i];
					nombrespm[i]=nombrespm[j];
					nombrespm[j]=variableauxiliar;
				}
			}
		}
	}*/

//Metodo booleano para saber si un ID de Pelicula de amor ya existe
	public boolean idpaIgual(int idpa, int arreglo[]){
		boolean igual = true;
		for(int i = 0; i<arreglo.length;i++){
			if(arreglo[i] == idpa){
				igual = false;
				break;
			}
		}
		return igual;
	}
	
	public void ingresarIdPeliculasAmor(){
		int opcion = 2;
		int idpaAux;
			
		while((nombrespa[25-1]==null) && (opcion == 2)){
			System.out.print("\nIngrese el ID de la pelicula: ");
			idpaAux = scanner.nextInt();
		
			if(idpaIgual(idpaAux,idpa)){
				for(int i = 0; i<nombrespa.length;i++){
					if(nombrespa[i] == null){
						idpa[i] = idpaAux;
						ingresarNombreAmor(i);
						break;
					}
				}
			}else{
			System.out.println("Este ID ya le pertenece a otra pelicula Infantil.");
			}
			System.out.println("\n1. Regresar al menu principal.");
			System.out.println("2. Agregar otro cliente.");
			System.out.print("\nElija una opcion: ");
			opcion = scanner.nextInt();
		}		
	}
	
	Scanner scanner5 = new Scanner(System.in);
	public void ingresarNombreAmor(int posicion){
		System.out.print("Ingrese el nombre de la pelicula: ");
		nombrespa[posicion] = scanner5.nextLine();
		System.out.print("Ingrese el anio de la pelicula: ");
		aniopa[posicion] = scanner.nextInt();
		System.out.print("Ingrese la categoria de la pelicula: ");
		amorpa[posicion] = scanner5.nextLine();
	}

		
	public void mostrarPeliculasMiedo(int[] idpa, String[] nombrespa, int[] aniopa, String[] amorpa){
		for( int i =0; i<nombrespa.length;i++){
			if(nombrespa[i] != null){
			System.out.println("\nId: "+idpa[i]+" ---Nombre: "+nombrespa[i]+" ---Anio: "+aniopa[i]+" ---Categoria: "+amorpa[i]+"\n");
			}
		}	
	}

	/*public void ordenarPeliculasAmor(String[] nombrespa){
		for(int i=0; i<nombrespa.length-1;i++){
			for(int j=i+1;j<nombrespa.length;j++){
				if(nombrespa[i].compareToIgnoreCase(nombrespa[j])>0){
					String variableauxiliar=nombrespa[i];
					nombrespa[i]=nombrespa[j];
					nombrespa[j]=variableauxiliar;
				}
			}
		}
	}*/

//metodo muestras las peliculas por categoria en reportes
	public void mostrarReportes(){
		int opcionreporte;
		
		do{
			System.out.println("\n-----Menu de reportes-----");
			System.out.println("\n1. Cantidad de peliculas.");
			System.out.println("2. Peliculas por categoria.");
			System.out.println("3. Las veces que se ha prestado una pelicula.");
			System.out.println("4. Pelicula mas prestada.");
			System.out.println("5. Pelicula menos prestada.");
			System.out.println("6. Volver al menu principal.");
			
			System.out.print("\nIngrese la opcion que desee: ");
			opcionreporte = scanner.nextInt();
			
			switch (opcionreporte){
				case 1:	
					break;
				case 2:
					mostrarPeliculas();
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					System.out.println("\nVolviendo al menu principal.");
                    System.out.println("-");
                    System.out.println("-");
                    System.out.println("-\n");
					break;
			}
		}while(opcionreporte!=6);
	}
	
	
}