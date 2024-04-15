import java.util.*;

public class Main {
  public static void main(String[] args) {
      Queue<Integer> q = new LinkedList<>();
      Stack<Integer> s = new Stack<>();
      Scanner sc = new Scanner(System.in);

      do {
        System.out.println("Enter a number");
        int num = sc.nextInt();
        q.add(num);

     } while ((sc.hasNextInt()));

      int stop = q.size();

      if (q.size() % 2 != 0) {
        q.add(0);
      }

      int meio=q.size()/2;
      for (int j = 0; j < meio; j++) {
        s.push(q.poll());
      }
    int circulo= q.size();
      while (!s.isEmpty()){
        for(int i=0;i<circulo-1;i++){
          q.add(q.poll());
        }
        q.add(s.pop());
        q.add(q.poll());
      }
      if(stop!=(q.size())){
        q.poll();
      }
      for(int i=0;i<circulo+2;i++){
        q.add(q.poll());
      
      System.out.println(q);
    }
  }
}