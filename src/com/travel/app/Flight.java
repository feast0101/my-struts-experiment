package com.travel.app;

public class Flight{
	
		private String FLIGHT_NUM;
		private String DEP_LOC;
		private String ARR_LOC;
		private String VALID_TILL;
		private String FLIGHT_TIME;
		private int FLIGHT_DURN;
		private int FARE;
		
		public Flight(String fLIGHT_NUM, String dEP_LOC, String aRR_LOC,
				String vALID_TILL, String fLIGHT_TIME, int fLIGHT_DURN,
				int fARE) {
			super();
			FLIGHT_NUM = fLIGHT_NUM;
			DEP_LOC = dEP_LOC;
			ARR_LOC = aRR_LOC;
			VALID_TILL = vALID_TILL;
			FLIGHT_TIME = fLIGHT_TIME;
			FLIGHT_DURN = fLIGHT_DURN;
			FARE = fARE;
		}
		public String getFLIGHT_NUM() {
			return FLIGHT_NUM;
		}
		public void setFLIGHT_NUM(String fLIGHT_NUM) {
			FLIGHT_NUM = fLIGHT_NUM;
		}
		public String getDEP_LOC() {
			return DEP_LOC;
		}
		public void setDEP_LOC(String dEP_LOC) {
			DEP_LOC = dEP_LOC;
		}
		public String getARR_LOC() {
			return ARR_LOC;
		}
		public void setARR_LOC(String aRR_LOC) {
			ARR_LOC = aRR_LOC;
		}
		public String getVALID_TILL() {
			return VALID_TILL;
		}
		public void setVALID_TILL(String vALID_TILL) {
			VALID_TILL = vALID_TILL;
		}
		public String getFLIGHT_TIME() {
			return FLIGHT_TIME;
		}
		public void setFLIGHT_TIME(String fLIGHT_TIME) {
			FLIGHT_TIME = fLIGHT_TIME;
		}
		public int getFLIGHT_DURN() {
			return FLIGHT_DURN;
		}
		public void setFLIGHT_DURN(int fLIGHT_DURN) {
			FLIGHT_DURN = fLIGHT_DURN;
		}
		public int getFARE() {
			return FARE;
		}
		public void setFARE(int fARE) {
			FARE = fARE;
		}
	
}
