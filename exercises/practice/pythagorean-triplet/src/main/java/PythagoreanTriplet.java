/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
public class PythagoreanTripletTest{
    public int pythagoreanTriplet(int N){
        int count=0;
        for(int i = 1;i <= N/3;i++){
            for(int j=i+1;j<=N/2;j++){
                int k=N-i-j;
               
                    if( (i*i)+(j*j)== k*k){
                        count++;
                    }
                
            }
        }
        return count;
    }
}
