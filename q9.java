public class q9 {

  public static void main(String[] args) {
    int a=0,b=0; double c=0;
    int s=1000;
    for(a=1;a<s/3;a++)
    {
      for(b=a;b<s/2;b++)
      {
        c=s-a-b;
        if(c*c==a*a+b*b){
        
        System.out.println("phythagorean triplets product are="+(long)(a*b*c));
        break;}
      }
    }
  }

}
