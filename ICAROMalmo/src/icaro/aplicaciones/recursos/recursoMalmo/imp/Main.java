package icaro.aplicaciones.recursos.recursoMalmo.imp;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		//Runtime.getRuntime().exec("taskkill /F /IM python.exe");
		String rutaIcaroMap = new File("src\\icaro\\aplicaciones\\recursos\\recursoMalmo\\imp\\icaro_map2.py").getAbsolutePath();
		PythonOrderDispatcher dispatcher = new PythonOrderDispatcher("C:\\Python27\\python",rutaIcaroMap, 9288);
		//Thread.sleep(10000);
		//System.out.println(dispatcher.sendCommand("obstacles"));
		//String input;
		//ClaseGeneradoraRecursoMalmo2 asd = new ClaseGeneradoraRecursoMalmo2(null);
		//asd.updateInformation();
		//System.out.println(dispatcher.sendCommand("left MalmoTutorialBot"));
		//System.out.println(dispatcher.sendCommand("right MalmoTutorialBot"));
		System.out.println("Inicio pruebas..");
		dispatcher.sendCommand("move robot1recolector 26.5 20.5");
        /*String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner
        while(entradaEscaner.hasNext())
        {
        	input = entradaEscaner.nextLine();
        	System.out.println(input);
        	if(!input.equalsIgnoreCase("exit"))
        		asd.dispatcher.sendCommand(input);
        }*/
		
        //System.out.println(asd.getInformacionManzanas());
		//System.out.println(asd.getInformacionAgentes());
		//System.out.println(asd.getInformacionObstaculos());
		/*
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String cadena="";
		try 
		{
			while(!cadena.equalsIgnoreCase("end"))
			{
				cadena = new String(entrada.readLine());
				asd.dispatcher.sendCommand(cadena);
				asd.updateInformation();
				System.out.println(asd.getInformacionAgentes());
			}
		}
		catch (IOException e) 
		{
			System.out.println("Error de E/S");
		} 
		*/
		System.out.println("Finalizando prueba...");
		boolean x = true;
		while(x){
			
		}
		dispatcher.closeDispatcher();
		//asd.close();
	}

}
