import java.util.LinkedList;
import java.util.Queue;

public class arr_Imp{
    public static class arr_Imp1
    {
        private int f=-1;
        private int r=-1;
        int size=0;
        private int arr[]=new int[5];

        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(f==-1){
                f=r=0;
                arr[0]=val;
            }
            else{
                arr[++r]=val;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[f];
        }

        public void Display(){
            if(size==0){
                System.out.print("Queue is Empty");
            }
            else{
                for(int i=0;i<arr[i];i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }


        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
    }
        public static void main(String[] args)
        {
            arr_Imp1 q=new arr_Imp1();
            q.Display();
            q.add(21);
            q.add(43);
            q.add(43);
            q.Display();
        }
}