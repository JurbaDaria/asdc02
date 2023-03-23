public static void bubbleS(ArrayList<String> list)
{
System.out.println("Bubble Sort");
int numIterations=0;
int numSwap = 0;
boolean isSorted = false;
int temp ;
while(!isSorted)
{
isSorted=true;
for(int j = 0;j<list.size()-1;j++)
{
if(Integer.parseInt(list.get(j).substring(0,list.get(j).indexOf("\t")))>
Integer.parseInt(list.get(j+1).substring(0,list.get(j+1).indexOf("\t"))))
{
isSorted = false;
toSwap(list, j, j+1);
numSwap++;
}
numIterations++;
}
}
System.out.println("The number of iterations : "+ numIterations);
System.out.println("The number of swaps : "+ numSwap);
}
//Метод toSwap
static void toSwap(ArrayList<String> list, int i, int j)
{
String temp = list.get(i);
list.set(i,list.get(j));
list.set(j,temp);
}
