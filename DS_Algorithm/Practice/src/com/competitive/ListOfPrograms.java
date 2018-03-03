package com.competitive;
import java.util.*;

public class ListOfPrograms{

	public static void main(String args[])
	{
	ListOfPrograms l = new ListOfPrograms();
	//l.PrintMissingNum();
	//l.deleteElementArray();
	//l.mergeTwoArrays();
	//l.duplicateInArray();
	//System.out.println(l.FirstRepeatElement()); //Its returns value
	l.TwoDmatrix();
	}

	public void selectionSort()
	{
	int[] arr = new int[]{10,9,8,7,6,5,4,3,2,1};
	int max;
	for(int i=arr.length-1 ;i>arr.length-3;i--)
		{
		max=i;
		for(int j=i ; j>0; j--)
			{
			if(arr[max]<arr[j-1])
				{
				max = j-1; 
				}
			}
		int temp = arr[i];
		arr[i] = arr[max];
		arr[max] = temp;
		}
	for(int x=0; x<arr.length;x++)
		{	
		System.out.println(arr[x] + " ");
		}
	}


	public void PrintMissingNum(){
	
		int[] arr = new int[]{1,2,4,5,7,9,10,15,30};
		int arrlast = arr[arr.length-1];
		for(int i=0,start=arr[0] ;start!=arrlast;)
		{
		if(arr[i] != start)
		{
		System.out.println(start);
		start++;
		}
		else{
			start++;
			i++;
		}
		}
	
	}

	public void deleteElementArray()
	{
	int[] arr = new int[]{1,2,3,4,5,6};
	int delete = 3;
	int deleteIndex = -1 ;
	for(int i=0 ; i<arr.length ; i++)
		{
		if(arr[i]==delete)
			{	
			deleteIndex = i;
			}
		}
	for(int  i = deleteIndex; i<arr.length-1 ; i++)
		{
		//Start swapping arr.length -1 because its swapping last not requires
		int temp = arr[i];
		arr[i] = arr[i+1];
		}
	for(int i=0 ; i<arr.length ; i++ )
		{
		System.out.println(arr[i]+" ");
		}
	//end of function
	}


	public void mergeTwoArrays()
	{
	int[] arr1 = new int[]{1,2,3,4,5,6};
	int[] arr2 = new int[]{6,7,8,9,10,11,12,13};
	int[] newarr = new int[arr1.length+arr2.length];
	int index=-1;
	for(int i=0; i<arr1.length ; i++)
	//first adding from 1st array
		{
		newarr[i]=arr1[i];
		index = i+1; 
		}	
	for(int i=0;i<arr2.length ; i++)
	//second array
		{
		newarr[index]=arr2[i];
		index++;
		}

	for(int i=0 ; i<newarr.length; i++)
		{
		System.out.print(newarr[i]+" ");
		}
	}
	


	public void duplicateInArray()
	{
	int arr[] = new int[]{1,1,2,3,4,5,4,3};
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0 ; i<arr.length ; i++)
                {
                if(map.containsKey(arr[i]))
                        {
                        map.put(arr[i],map.get(arr[i])+1);
                        }
                else
                        {
                        map.put(arr[i],1);
                        }
                }
        for(Map.Entry<Integer,Integer> m : map.entrySet())
                {
                if(m.getValue()>1)
                        {
                        System.out.println(m.getKey());
                        }
                }
	}


	public int FirstRepeatElement()
	{
	//First repeating element in an array
	int arr[] = new int[]{1,2,3,2,4,5,4,3};
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0 ; i<arr.length ; i++)
                {
                if(map.containsKey(arr[i]))
                        {
                        map.put(arr[i],map.get(arr[i])+1);
			return arr[i];
                        }
                else
                        {
                        map.put(arr[i],1);
                        }
                }
	return -1;
	}


	public void TwoDmatrix()
	{
	System.out.println("Taking input and print values for 2D array");
	int[][] arr = new int[2][3];
	for(int i=0;i<arr.length;i++)
		{
		for(int x=0;x<arr[0].length;x++)
			{
			Scanner s = new Scanner(System.in);
			arr[i][x] =s.nextInt();
			}
		}
	for(int i=0;i<arr.length;i++)
                {
                for(int x=0;x<arr[0].length;x++)
                        {
                        System.out.print(arr[i][x] + " ");
                        }
		System.out.println();
                }
	}
}	


