package joven_chano;
import java.util.Scanner;
		/**
		 * @author Tilo
		 * @version 0.1
		 * @since 0.0
		 */
public class chanete {

	
	static Scanner sc = new Scanner(System.in);
	static String a="";
		/**
		 *<p>
		 * Programa que rep un numero de casos, un numero de pokemon per cas i un nivell per cada pokemon.
		 * <p>
		 * Retorna el nombre de zubats, bellsprouts i metapods
		 * necessaris per a que tot el equip puji al 100.
		 * 
		 */
	public static void main(String[] args) {
		
		int casos= sc.nextInt();
		for(int i=0;i<casos;i++) {
			
			int pokemons= sc.nextInt();
			int numzub=0;
			int numbell=0;
			int nummeta=0;
			
			a+="Equipo "+(i+1)+": \n";
			if(pokemons==0) {
				a+="No tienes ningun pokemon\n";
			}
			else{
			for(int j=0;j<pokemons;j++) {
				int lvl=sc.nextInt();
				if(lvl==0) {
					a+="Tienes un huevo, no puede levear\n";
				}
				else {
				numzub+=calczub(lvl);
				numbell+=calcbell(lvl);
				nummeta+=calcmeta(lvl);
				}
			}
			a+=numzub+" zubats\n";
			a+=numbell+" bellsprouts\n";
			a+=nummeta+" metapods\n";
		}	
		}
		System.out.println(a);
	}
		/**
		 * <p>
		 *  calczub Funcio que calcula el nombre de zubats que es necessiten per pujar un pokemon al 100
		 * @param lvl nivell del pokemon
		 * @return nombre de zubats necessaris per pujar de lvl al 100
		 */
	public static int calczub(int lvl) {
		
		int exp=0;
		int tilo=100-lvl;
		exp+=tilo*1000/1;
		return exp;
		
	}
	
	/**
	 * <p>
	 *  calcbell Funcio que calcula el nombre de bellsprout que es necessiten per pujar un pokemon al 100
	 * @param lvl nivell del pokemon
	 * @return nombre de bellsprouts necessaris per pujar de lvl al 100
	 */
	
	public static int calcbell(int lvl) {
		
		int exp=0;
		int tilo=100-lvl;
		exp+=tilo*1000/10;
		return exp;
		
	}
	
	/**
	 * <p>
	 *  calcmeta Funcio que calcula el nombre de metapods que es necessiten per pujar un pokemon al 100
	 * @param lvl nivell del pokemon
	 * @return nombre de metapods necessaris per pujar de lvl al 100
	 */
	public static int calcmeta(int lvl) {
		
		int exp=0;
		int tilo=100-lvl;
		exp+=tilo*1000/100;
		return exp;
		
	}
}

