package Homework5;

public class Problem1Class {
	
	private double total;
	private boolean specialOrderStatus;

	public void specialOrder (boolean deepDish, double ordAmount, int numPizzas) {

		total=ordAmount;
		double taxRate=0.0825;

		if(ordAmount>500.00)
			total=total*0.80*(1+taxRate);
		else
			if (ordAmount>250.00)
				total=total*0.85*(1+taxRate);
			else
				if (ordAmount>100.00)
					total=total*0.90*(1+taxRate);
				else
					if(ordAmount>50.00)
						total=total*0.95*(1+taxRate);
					else
						total=total*(1+taxRate);
				
		specialOrderStatus = (!deepDish) || (ordAmount > 50.0) || (numPizzas > 4);
		}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isSpecialOrderStatus() {
		return specialOrderStatus;
	}

	public void setSpecialOrderStatus(boolean specialOrderStatus) {
		this.specialOrderStatus = specialOrderStatus;
	}
}