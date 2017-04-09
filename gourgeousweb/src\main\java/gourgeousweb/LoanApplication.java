package gourgeousweb;

import java.util.Date;

public class LoanApplication {

		private Person person;
		private Address adress;
		private LoanParameters paramteres;
		private String number;
		private Date date;
		public Person getPerson() {
			return person;
		}
		public void setPerson(Person person) {
			this.person = person;
		}
		public Address getAdress() {
			return adress;
		}
		public void setAdress(Address adress) {
			this.adress = adress;
		}
		public LoanParameters getParamteres() {
			return paramteres;
		}
		public void setParamteres(LoanParameters paramteres) {
			this.paramteres = paramteres;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
}
