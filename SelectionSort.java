public class SelectionSort {
static void toSwap(ArrayList<String> list, int i, int j)
{
String temp = list.get(i);
list.set(i,list.get(j));
list.set(j,temp);
}
public static void selectionSort(ArrayList <String> list)
{
System.out.println("Selection Sort");
int num =0;
int numSwap =0;
for(int i=0;i<list.size()-1;i++)
{
int temp_position = i;
for(int j=i+1;j<list.size();j++)
{
num++;
if(Integer.parseInt(list.get(j).substring(0,list.get(j).indexOf("\t")))<
Integer.parseInt(list.get(temp_position).substring(0,list.get(temp_position).
indexOf("\t"))))
{
temp_position=j;
}
}
toSwap(list,i,temp_position);
numSwap++;
}
System.out.println("The number of iterations : "+ num);
System.out.println("The number of swaps : "+ numSwap);
}
}
