package F3T2;

import java.util.Vector;

public class Customer {
	private final String _name;
	private final Vector<Rental> _rentals = new Vector<>();

	public Customer(String name) {
		this._name = name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	}

	// v4: sem temps locais; usa queries no rodapé
	public String statement() {
		StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

		for (Rental each : _rentals) {
			result.append("\t")
					.append(each.getMovie().getTitle())
					.append("\t")
					.append(each.getAmount())
					.append("\n");
		}

		result.append("Amount owed is ").append(getTotalAmount()).append("\n");
		result.append("You earned ").append(getTotalFrequentRenterPoints()).append(" frequent renter points");
		return result.toString();
	}

	private double getTotalAmount() {
		double total = 0;
		for (Rental each : _rentals) total += each.getAmount();
		return total;
	}

	private int getTotalFrequentRenterPoints() {
		int total = 0;
		for (Rental each : _rentals) total += each.getFrequentRenterPoints();
		return total;
	}
}
