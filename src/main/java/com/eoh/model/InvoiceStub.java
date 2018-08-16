/* package com.eoh.model;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class InvoiceStub {


	private static Map<Long, Invoice> slips = new HashMap<Long, Invoice>();
	private static Long idIndex = 3L;

	//populate initial incoices
	static {
		Invoice a = new Invoice(1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
		slips.put(1L, a);
		Invoice b = new Invoice(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994);
		slips.put(2L, b);
		Invoice c = new Invoice(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994);
		slips.put(3L, c);
	}

	public static List<Invoice> list() {
		return new ArrayList<Invoice>(slips.values());
	}

	public static Invoice create(Invoice slip) {
		idIndex += idIndex;
		slip.setId(idIndex);
		slips.put(idIndex, slip);
		return slip;
	}

	public static Invoice get(Long id) {
		return slips.get(id);
	}

	public static Invoice update(Long id, Invoice slip) {
		slips.put(id, slip);
		return slip;
	}

	public static Invoice delete(Long id) {
		return slips.remove(id);
	}
} 

*/