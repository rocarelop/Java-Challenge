import java.util.List;
import java.util.Arrays;

public class Array {

  private Integer[] arr;

  Array(Integer[] arr){
    this.arr = arr;
  }

  public Integer maximum(){
    List<Integer> numList = Arrays.asList(this.arr);
    Integer max = numList.get(0);
  
    for (int i = 1; i < numList.size(); i++) {
      if (numList.get(i) > max) {
        max = numList.get(i);
      }
    }
    return max;
  }

  public double average() { 
    List<Integer> lista = Arrays.asList(this.arr);
    Integer suma = 0;
    if(lista.size()!=0){
      for(Integer i =0; i< lista.size(); i++){
        suma += lista.get(i);
      }
    }
  return suma.doubleValue()/ lista.size(); 
}




}