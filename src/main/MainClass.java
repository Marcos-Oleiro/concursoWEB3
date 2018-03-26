package main;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import jaxbmodels.Candidate;
import model.CandidateFinal;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainClass {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		
		

		JAXBContext jc = JAXBContext.newInstance(Candidate.class);
		
		Unmarshaller un = jc.createUnmarshaller();
		
		Candidate cdt1_pos1 = (Candidate) un.unmarshal(new File("src/lib/candidato1-cargo1.xml"));
		CandidateFinal cf1_pos1 = new CandidateFinal(cdt1_pos1);  
		
		Candidate cdt2_pos1 = (Candidate) un.unmarshal(new File("src/lib/candidato2-cargo1.xml"));
		CandidateFinal cf2_pos1 = new CandidateFinal(cdt2_pos1);
		
		Candidate cdt3_pos1 = (Candidate) un.unmarshal(new File("src/lib/candidato3-cargo1.xml"));
		CandidateFinal cf3_pos1 = new CandidateFinal(cdt3_pos1);
		
		Candidate cdt4_pos1 = (Candidate) un.unmarshal(new File("src/lib/candidato4-cargo1.xml"));
		CandidateFinal cf4_pos1 = new CandidateFinal(cdt4_pos1);
		
		Candidate cdt1_pos2 = (Candidate) un.unmarshal(new File("src/lib/candidato1-cargo2.xml"));
		CandidateFinal cf1_pos2 = new CandidateFinal(cdt1_pos2);
		
		Candidate cdt2_pos2 = (Candidate) un.unmarshal(new File("src/lib/candidato2-cargo2.xml"));
		CandidateFinal cf2_pos2 = new CandidateFinal(cdt2_pos2);
		
		Candidate cdt3_pos2 = (Candidate) un.unmarshal(new File("src/lib/candidato3-cargo2.xml"));
		CandidateFinal cf3_pos2 = new CandidateFinal(cdt3_pos2);
		
		Candidate cdt4_pos2 = (Candidate) un.unmarshal(new File("src/lib/candidato4-cargo2.xml"));
		CandidateFinal cf4_pos2 = new CandidateFinal(cdt4_pos2);
		
		Candidate cdt1_pos3 = (Candidate) un.unmarshal(new File("src/lib/candidato1-cargo3.xml"));
		CandidateFinal cf1_pos3 = new CandidateFinal(cdt1_pos3);
		
		Candidate cdt2_pos3 = (Candidate) un.unmarshal(new File("src/lib/candidato2-cargo3.xml"));
		CandidateFinal cf2_pos3 = new CandidateFinal(cdt2_pos3);
		
		Candidate cdt3_pos3 = (Candidate) un.unmarshal(new File("src/lib/candidato3-cargo3.xml"));
		CandidateFinal cf3_pos3 = new CandidateFinal(cdt3_pos3);
		
		Candidate cdt4_pos3 = (Candidate) un.unmarshal(new File("src/lib/candidato4-cargo3.xml"));
		CandidateFinal cf4_pos3 = new CandidateFinal(cdt4_pos3);
		
		Candidate cdteste= (Candidate) un.unmarshal(new File("src/lib/cdteste.xml"));
		CandidateFinal cfteste = new CandidateFinal(cdteste);
		
		ArrayList<CandidateFinal> candidates_pos1 = new ArrayList();
		ArrayList<CandidateFinal> candidates_pos2 = new ArrayList();
		ArrayList<CandidateFinal> candidates_pos3 = new ArrayList();
		
		
		candidates_pos1.add(cf1_pos1);
		candidates_pos1.add(cf2_pos1);
		candidates_pos1.add(cf3_pos1);
		candidates_pos1.add(cfteste);
		
		
		candidates_pos2.add(cf1_pos2);
		candidates_pos2.add(cf2_pos2);
		candidates_pos2.add(cf3_pos2);
		
		candidates_pos3.add(cf1_pos3);
		candidates_pos3.add(cf2_pos3);
		candidates_pos3.add(cf3_pos3);
		
		
		System.out.println(cfteste.getRegistration_date().getYear());
		
		Collections.sort(candidates_pos1, new ComparatorClass().compare());
		
		
		

		
	}

}
