public class HeapSort {
static int it =0;
static int s=0;
public static void sort(ArrayList<String> list)
{
System.out.println("Heap Sort");
int n = list.size();
for (int i = n / 2 - 1; i >= 0; i--) heapf(list, n, i);
for (int i = n - 1; i > 0; i--) {it++;
String temp = list.get(0);
list.set(0,list.get(i));
list.set(i,temp);
s++;
heapf(list, i, 0);
}
System.out.println("The number of iterations : "+ it);
System.out.println("The number of swaps : "+ s);
}
static void heapf(ArrayList<String> list, int n, int i)
{
int largest = i;
int l = 2 * i + 1;
int r = 2 * i + 2;
it++;
if (l < n &&
Integer.parseInt(list.get(l).substring(0,list.get(l).indexOf("\t"))) >
Integer.parseInt(list.get(largest).substring(0,list.get(largest).indexOf("\t"
))))
largest = l;
if (r < n &&
Integer.parseInt(list.get(r).substring(0,list.get(r).indexOf("\t"))) >
Integer.parseInt(list.get(largest).substring(0,list.get(largest).indexOf("\t"
))))
largest = r;
if (largest != i) {
String swap = list.get(i);
list.set(i,list.get(largest));
list.set(largest,swap);s++;
heapf(list, n, largest);
}
}
