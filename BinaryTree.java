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
}
