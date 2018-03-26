package main;

import java.util.Comparator;

import model.CandidateFinal;

public class ComparatorClass implements Comparator<CandidateFinal>{
	
	@Override
	public int compare(CandidateFinal o1, CandidateFinal o2) {
		// TODO Auto-generated method stub
		if (o1.getFinal_count() == o2.getFinal_count()  ) {
			
			if (  o1.getSpec_count() == o2.getSpec_count() ) {
				
				if ( o1.getMath_count() == o2.getMath_count()) {
					
					if (o1.getRegistration_date().getYear() == o2.getRegistration_date().getYear()) {
						
						if (o1.getRegistration_date().getMonth() == o2.getRegistration_date().getMonth()) {
							
						
							if (o1.getRegistration_date().getDay() == o2.getRegistration_date().getDay()) {
								
								if (  o1.getRegistration_number().compareTo(o2.getRegistration_number() ) == 1  ) {
									return 1;
								}
								else {
									return -1;
								}
								
							}
							else {										
								if ( o1.getRegistration_date().getDay() > o2.getRegistration_date().getDay() ) {
									return 1;
									
								}
								else {
									return -1;
								}
							}
						}
						else {
							
							if ( o1.getRegistration_date().getMonth() >  o2.getRegistration_date().getMonth() ) {
								
								return 1;
							}
							else {
								return -1;
							}
						}
					}
					else {
						if ( o1.getRegistration_date().getYear() > o2.getRegistration_date().getYear()) {
							return 1;							
						}
						else{
							return -1;
						}
					}
				}
				else {
					
					if ( o1.getMath_count() > o2.getMath_count() ) {
						return 1;
					}
					else{
						return -1;
					}
				}
			}
			else {
				
				if ( o1.getSpec_count() > o2.getSpec_count()) {
					return 1;
				}
				else{
					return -1;
				}
			}
			
		}else {
			if ( o1.getFinal_count() > o2.getFinal_count()) {
				return 1;
			}
			else{
				return -1;
			}
			
		}
//		return 0;
	}	

}
