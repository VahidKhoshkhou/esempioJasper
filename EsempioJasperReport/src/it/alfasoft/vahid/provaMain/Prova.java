package it.alfasoft.vahid.provaMain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import it.alfasoft.vahid.dao.ClienteDao;
import it.alfasoft.vahid.dto.Cliente;

public class Prova {

	public static void main(String[] args) {
	
		
		ClienteDao cDAo=new ClienteDao();
		
		Double d;
		
		String nomeFile="ElencoClienti.pdf";
		
		 String percorso  = "C:\\Users\\admin\\Documents\\A0\\";
		 
		 String fileFinale=percorso+nomeFile;
		 
		 
		
		try {
             

           //la mia lista che mantiene i dati
             List<Cliente> clienti = cDAo.getListaClienti();
     

           // Converto la  lista to JRBeanCollectionDataSource 
           JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(clienti,false);

           //  una mappa per mandare i parametri a Jasper 
           Map<String, Object> parameters = new HashMap<String, Object>();
         
           parameters.put("ClienteDataSource", itemsJRBean);
           parameters.put("importo", 2.5);

           //  file compilato di jasper (.jasper) di Jasper Report per creare  PDF 
           JasperPrint jasperPrint = JasperFillManager.fillReport("ElencoClienti.jasper", parameters, new JREmptyDataSource());

           //outputStream per creare PDF 
           OutputStream outputStream = new FileOutputStream(new File(fileFinale));
          
           
           // scrivo in un  file PDF  
         
           JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);

           System.out.println("File e' stato creato");
            
     
          
           
           
           
       } catch (JRException ex) {
           ex.printStackTrace();
       } catch (FileNotFoundException ex) {
           ex.printStackTrace();
       }
		
		

	}

}
