public class BinaryTree{
  String[] arr;
  int lastUsedIndex;

  public BinaryTree(int size){
    arr=new String[size+1]; //not using the first index for simplicity.
    this.lastUsedIndex=0;
    System.out.println("BT of size "+ size+ " created.");
  }

  boolean isFull(){
    if(lastUsedIndex==arr.length-1){
      return true;
    }
    return false;
  }

  void insert(String value){
    if(!isFull()){
      arr[lastUsedIndex+1]=value;
      lastUsedIndex+=1;
      System.out.println("The value of "+value+" has been inserted.");
    }
    else{System.out.println("BT already full.");}
  }

  public void preOrder(int index){
    if(index>lastUsedIndex){
      return;
    }
    System.out.print(arr[index]+" ");
    preOrder(2*index); //O(n/2)
    preOrder(2*index+1); //O(n/2)
  } //space complexity=O(N), whenever function calls recursively, it has to insert elements in the stack memory to remember.

  public void inOrder(int index){
    if(index>lastUsedIndex){
      return;
    }
    inOrder(index*2);
    System.out.print(arr[index]+" ");
    inOrder(index*2+1);
  }

  public void postOrder(int index){
    if(index>lastUsedIndex){
      return;
    }
    postOrder(index*2);
    postOrder(index*2+1);
    System.out.print(arr[index]+" ");
  }

  public void leverOrder(){
    for(int i=1;i<lastUsedIndex+1;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
