package com.raju.array;
public class SortThreeElemArray {
	
	public static int[] sort(int[] a)
	{
		int Fpos = 0, SPos = a.length-1;
		int j, tmp;
		outer:
		for(int i = 0; i < a.length; i++)
		{
			if(SPos >= Fpos && i <= SPos)
			{
				if (a[i] == 2)
				{
					if(a[SPos] == 2)
					{
						for(j = SPos-1; j >= 0; j--)
						{
							System.out.println("j :" + j);
							if (j < i)
								break outer;
							if(a[j] != 2)
							{
								SPos = j;
								break;
							}
							
						}
					}
					tmp = a[SPos];
					a[SPos] = a[i];
					a[i] = tmp;
					
					SPos--;
				}
				if (a[i] == 0)
				{
					if(a[Fpos] == 0)
					{
						for(j = Fpos+1; j < a.length; j++)
						{
							if(a[j] != 0)
							{
								Fpos = j;
								break;
							}
						}
					}
					tmp = a[Fpos];
					a[Fpos] = a[i];
					a[i] = tmp;
					
					Fpos++;
				}
				for(int k =0; k < a.length; k++)
					System.out.print(a[k]+" ");
			}
			else
			{
				System.out.println();
				break;
			}
			System.out.println("Fpos :" + Fpos + ",Spos:"+SPos + " i: " + i);
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,0,1,2,2,1,0,2,2,1,0,2,1,0,2,1,0,2,2,0,1,2,0,2,1,2,2,2,2,1,1,1,1,1,0,0,0,0,1,1,2};
		
		for(int i =0; i < a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		
		a = SortThreeElemArray.sort(a);

		for(int i =0; i < a.length; i++)
			System.out.print(a[i]+" ");

	}

}
