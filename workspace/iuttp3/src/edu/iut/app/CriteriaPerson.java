package edu.iut.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CriteriaPerson implements Criteria{

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> ex, Date criteram) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> ex, Person criteram) {
		List<ExamEvent> EventOk = new ArrayList<ExamEvent>(); 
	      
	      for (ExamEvent exame : ex) {
	         if(exame.getStudent() == criteram){
	        	 EventOk.add(exame);
	         }
	      }
	      return EventOk;
	}

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> ex, Classroom criteram) {
		// TODO Auto-generated method stub
		return null;
	}

}
