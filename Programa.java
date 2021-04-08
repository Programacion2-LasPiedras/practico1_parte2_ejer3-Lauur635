import java.util.Scanner;
class Main {

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			          
			    System.out.println("Escriba dos palabras");
			    String palabra1=sc.next();
			    String palabra2=sc.next();
			    int opcion;
			    
			    boolean salir=false;
			    
			 
			    
			    while(!salir) {
			    	
			   
			    	System.out.println("1. Ver la longitud de ambas cadenas ");
			    	System.out.println("2. Comparar igualdad y quien es menor (en caso de ser cadenas distintas)");
			    	System.out.println("3. Cambiar 1ra cadena a todo mayúsculas y 2da a todo minúsculas");
			    	System.out.println("4. Cargar nuevamente ambos String.");
			    	System.out.println("0. Salir");
			    	
				  
			    	
				    	System.out.println("Introduce un numero");
				    	
				    	opcion=sc.nextInt();
				    	
				    	
			    	
				    	switch(opcion) {
				    	    
				    case 1 :
				    		
					    		System.out.println("Opcion 1");
					    		 
					    	       var largo=palabra1.length();
					    	       
					    		System.out.println("La cadena tiene " + largo +  " letras");
					    		
					    		
					    		   var longitud=palabra2.length();
					    		 
					    		System.out.println("La cadena tiene " + longitud + " letras");   
					    	     
					    		
				    		
				    		break;
			    	
			    
			    	case 2 : 
			    			
					    		System.out.println("Opcion 2 ");
						    		
					    		int num=palabra1.compareTo(palabra2);
					    		if(palabra1.equalsIgnoreCase(palabra2)) {
					    			System.out.println(" Las palabra son iguales" );
					    		}else {
					    			if(num < 0){
					    				
					    			System.out.println(" La palabra  "  +  palabra1  +  " es menor que la palabra "  +  palabra2 );
					 	
					   			}else {
					   				
					   				System.out.println(" La palabra  "  +  palabra1  +  " es distinta que la palabra "  +  palabra2 );
					   			}
				    		}
		    		
		    		
			    		     break; 
			    		
			    		
					case 3:
						    			
							    	System.out.println(palabra1.toUpperCase());
							    	
							    	
							    	System.out.println(palabra2.toLowerCase());
									 
							 		
							   	
					  	     break;
						
					  	     
				   	case 4 :
						    		
						    		System.out.println("Opcion 4");
						    		
						    		System.out.println(palabra1);
						    		
							    	System.out.println(palabra2);
							 
							    	
							 break;
							    		
							 
					case 0:
							 
						
						              salir=true;
						              
					     	 break;
							    	
				    	
				    	
				    	}
							    	
			    	
			    	}
			    		
			   	
		}
				    	
		
			
	}
		
		
			
		
		
