class Meeting 
{
   int start;
   int end;

   Meeting(int start , int end)
   {
       this.start=start;
       this.end=end;
   }
}

class MComparator implements Comparator<Meeting>
{
   public int compare(Meeting a , Meeting b)
   {
       return a.end - b.end;
   }
}
class Solution
{
 
   public static int activitySelection(int start[], int end[], int n)
   {
       // add your code here
       ArrayList<Meeting> list=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
           list.add(new Meeting(start[i], end[i]));
       }

       MComparator m=new MComparator();
       Collections.sort(list , m);
       
      int count=1;
       
       int limit=list.get(0).end;
       for(int i=1;i<n;i++)
       {
           if(list.get(i).start >limit)
           {
            
               count++;
               limit=list.get(i).end;
           }
           
       }
       return count;

   }
}