public class array {
	public static void main(String[] args) {

	int[] arr = {2001,122,3434,4343};

	System.out.println("arr is :"+arr);

	int[][] arr2 = {
			{2001,234,223},
			{34,45,45,5,76,454,454},
			{233,33,423,344},
			{333}
	};

	System.out.print("arr2 is :"+arr2);

	arr2[1][2] = 200;
	System.out.print("arr2[1][2] is :"+arr2[1][2]);


	//for (int i=0; i<arr2.length;i++){
	//	System.out.println("arr2["+i+"]is: " +arr2[i]+"and arr2[+i+] length is: " +arr2[i].length");
	//}


    }
}