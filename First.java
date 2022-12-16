import java.util.*;
public class First{
public static void main(String args[]){
    Scanner s= new Scanner (System.in);
    int size = s.nextInt();
    int A[]=new int[size];
    for(int i=0;i<size;i++){
        A[i]=s.nextInt();
    }
    System.out.println(solution(A));
}
static int solution(int A[]){
    int n = A.length;
    Set<Integer> st= new HashSet<Integer>();
    for(int i=0;i<n;i++){
        st.add(A[i]);
    }
    int arr2[]=new int[n];
    for(int i=0;i<n;i++){
        arr2[i]=i+1;
    }
    for(int i=0;i<n;i++){
        if(st.contains(arr2[i])==false){
            return arr2[i];
        }
    }
    return -1;
}
}