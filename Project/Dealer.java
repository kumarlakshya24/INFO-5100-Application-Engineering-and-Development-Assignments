package dealersearch;
public class Dealer implements Comparable<Dealer>{
		
		private String dealerName;
		private String phoneNumber;
		private String address;
		private String id;
		public Dealer()
		{
			
		}
		public Dealer(String dealerName, String phoneNumber, String address, String id)
		{
			this.dealerName = dealerName;
			this.phoneNumber = phoneNumber;
			this.address = address;
			this.id = id;
		}
		
		public String getName() {
			return dealerName;
		}
		
		public void setName(String dealerName) {
			if (dealerName == null) {
	            throw new IllegalArgumentException();
	        }
			this.dealerName = dealerName;
		}
		
		public String getPhone() {
			return phoneNumber;
		}
		
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}

		public String getID() {
			return id;
		}

	@Override
	public int compareTo(Dealer d) {
		return this.dealerName.compareTo(d.getName());
	}
	
	 public boolean equals(Object obj) {
	        if (obj == null) return false;
	        if (obj instanceof Dealer) {
	            Dealer d = (Dealer) obj;
	            if (this.dealerName.equals(d.getName())) {
	                return true;
	            }
	        }
	 
	        return false;
	    }
}
