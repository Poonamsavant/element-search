import java. util.*;
module searchele
{
	// for searching an element in an array
	public static void main(String[] args){
	int i,key,size;
	boolean flag=false;
	Scanner s= new Scanner(System.in);
	size = s.nextInt();
	//key = s.nextInt();
	int arr[] = new int[size];
	for(i=0; i<size; i++)
		arr[i] = s.nextInt();
		key = s.nextInt();
	for(i=0; i<size; i++)
	if(arr[i]==key)
	{
	    System.out.println("index position of"+key + "is" +i);
	     flag=true;
	}
	if (flag==false)
		System.out.println("not found");
	}
	
}