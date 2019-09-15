package Homework5;

public class Problem2Class {
	
	public double calcTotal (double total, boolean existingMember, boolean validDiscount, int memberPoints) {
		
		return ((existingMember || validDiscount && memberPoints>=650) && (total >= 2_000.0)) ? 0.85*total*1.0825 : total*1.0825;
	}
}