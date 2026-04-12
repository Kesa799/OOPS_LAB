class Performer{
public static void main(String args[]){
int[] marks = new int[5];
marks[0]=90;
marks[1]=78;
marks[2]=86;
marks[3]=96;
marks[4]=92;

int total=0; int max=marks[1]; double avg; int top=1;

for (int i=0;i<5;i++){
total+=marks[i];
if (marks[i]>max){
max=marks[i];
top = i;
}
}

avg = total/5;

System.out.println("Total: "+total);
System.out.println("Average: "+avg);
System.out.println("Top performer: Student "+(top+1));
System.out.println("Highest marks: "+max);
}
}