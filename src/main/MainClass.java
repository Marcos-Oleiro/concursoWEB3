package main;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import jaxbmodels.Candidate;

import java.io.File;

public class MainClass {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		
		

		JAXBContext jc = JAXBContext.newInstance(Candidate.class);
		
		Unmarshaller un = jc.createUnmarshaller();
		
		Candidate cdt1_pos1 = (Candidate) un.unmarshal(new File("src/lib/candidato1-cargo1.xml"));
		Candidate cdt2_pos1 = (Candidate) un.unmarshal(new File("src/lib/candidato2-cargo1.xml"));
		Candidate cdt3_pos1 = (Candidate) un.unmarshal(new File("src/lib/candidato3-cargo1.xml"));
		Candidate cdt4_pos1 = (Candidate) un.unmarshal(new File("src/lib/candidato4-cargo1.xml"));
		
		Candidate cdt1_pos2 = (Candidate) un.unmarshal(new File("src/lib/candidato1-cargo2.xml"));
		Candidate cdt2_pos2 = (Candidate) un.unmarshal(new File("src/lib/candidato2-cargo2.xml"));
		Candidate cdt3_pos2 = (Candidate) un.unmarshal(new File("src/lib/candidato3-cargo2.xml"));
		Candidate cdt4_pos2 = (Candidate) un.unmarshal(new File("src/lib/candidato4-cargo2.xml"));
		
		Candidate cdt1_pos3 = (Candidate) un.unmarshal(new File("src/lib/candidato1-cargo3.xml"));
		Candidate cdt2_pos3 = (Candidate) un.unmarshal(new File("src/lib/candidato2-cargo3.xml"));
		Candidate cdt3_pos3 = (Candidate) un.unmarshal(new File("src/lib/candidato3-cargo3.xml"));
		Candidate cdt4_pos3 = (Candidate) un.unmarshal(new File("src/lib/candidato4-cargo3.xml"));
		
		int i = 1;
		String aux = "getMq" + String.valueOf(i);

		System.out.println(2 == 3 ? "errado" :"certo" );
	}

}
