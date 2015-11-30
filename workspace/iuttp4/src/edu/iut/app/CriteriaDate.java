package edu.iut.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CriteriaDate implements Criteria{


	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> ex, Date criteram) {
		List<ExamEvent> EventOk = new ArrayList<ExamEvent>(); 
	      
	      for (ExamEvent exame : ex) {
	         if(exame.getExamDate() == criteram){
	        	 EventOk.add(exame);
	         }
	      }
	      return EventOk;
	}

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> ex, Person criteram) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> ex, Classroom criteram) {
		// TODO Auto-generated method stub
		return null;
	}

}
