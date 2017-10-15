/**
 * 
 */
package assingment9_3;

import java.util.Comparator;

/**
 * @author MANJUNATH
 *
 */
public class HDTV {

	/**
	 * @param -
	 *            brandname= to set/get the brand name from the user.
	 * @param -
	 *            size= to set/get the HDTV size from user
	 */
	private String brandname = "";
	private int size = 0;

	public HDTV(String brandname, int size) {
		super();
		this.brandname = brandname;
		this.size = size;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public static Comparator<HDTV> sizeSort = new Comparator<HDTV>() {

		@Override
		public int compare(HDTV o1, HDTV o2) { // Compare get the size objects and compare the two object to sort
												// between them.
			int sizeOne = o1.getSize(); // get the size of object1
			int sizeTwo = o2.getSize(); // get the size of object2
			/* For ascending order */
			return sizeOne - sizeTwo; // compare the size and return the final result in ascending order
			/* For descending order */
			// return sizeTwo - sizeOne;
		}
	};

	@Override
	public String toString() {
		return "Brand name=" + brandname + ",\tSize=" + size; // toString to display the resulted Brand name and size
																// value.
	}

}
