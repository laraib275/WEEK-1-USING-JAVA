public class implement_stack {
    protected int[] data;
    public static final int DEFAULT_SIZE=10;

    public implement_stack() {
        this(DEFAULT_SIZE);
    }
    public implement_stack(int size){
        this.data=new int[size];
    }
    int ptr=-1;
     public boolean push(int item){
         if(isfull()){
             System.out.println("your stack is full!!");
         }
         ptr++;
         data[ptr]=item;
         return true;
     }

     public int pop() throws Exception{
         if(isempty()){
             throw new Exception("your stack is empty!!");
         }
         int returned=data[ptr];
         ptr--;
         return returned;
     }
     public int peek() throws Exception{
         if(isempty()){
             throw new Exception("stack empty!!");
         }
         return data[ptr];
     }
      private boolean isfull(){
         return ptr==data.length-1;
      }
      private boolean isempty() {
         return ptr==-1;
      }
}
