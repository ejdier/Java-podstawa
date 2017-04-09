package service;
import java.util.ArrayList;
import java.util.List;
import gourgeousweb.LoanApplication;

public class LoanService {
	 private List<LoanApplication> loans =
			 new ArrayList<LoanApplication>();
	 public void add(LoanApplication applitacion){
		 if(loans.contains(applitacion))
			 return;
		 loans.add(applitacion);
	 }

	 public List<LoanApplication> getAll(){
		 return loans;
	 }
}
