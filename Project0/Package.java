
public class Package {
	
	private int weight, dimension1, dimension2, dimension3;
	private int longDim, shortDim1, shortDim2;
	private int size, girth;
	
	
	public void Box (int w, int d1, int d2, int d3) {
		dimension1 = d1;
		dimension2 = d2;
		dimension3 = d3;
		weight = w;
	}
	
	
	//Calling this method will determine the longest dimension
	public void longestDimension () {
		if (dimension1 >= dimension2 && dimension1 >= dimension3) {
			longDim = dimension1;
			shortDim1 = dimension2;
			shortDim2 = dimension3;
			//return dimension1;
		} else if (dimension2 >= dimension1 && dimension2 >= dimension3) {
			longDim = dimension2;
			shortDim1 = dimension1;
			shortDim2 = dimension3;
			//return dimension2;
		} else {
			longDim = dimension3;
			shortDim1 = dimension1;
			shortDim2 = dimension2;
			//return dimension3;
		}
	}
	
	
	//Girth Calculation
	public int girthCalc () {
		girth = (shortDim1 + shortDim2) * 2;
		return girth;
	}
	
	
	//Size Calculation
	public int sizeCalc () {
		size = (girth + longDim);
		return size;
	}
	
	
	//Determine if dis dam pack is acceptable das my q&a
	public String susDet() {
		if (weight > 70 && size > 100) {
			return "Your package is too large and too heavy.";
		} else if (size > 100) {
			 return "Your package is too large.";
		} else if (weight > 70) {
			return "Your package is too heavy.";
		} else {
			return "Your package is acceptable.";
		}
	}
}
