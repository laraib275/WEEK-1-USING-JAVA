public class HCF_LCM {
    public static void main(String[] args) {
int a=3;
int b=72;
int x=a;
int y=b;
int hcf=1;
int lcm;
int max;
if(x>y){
    max=x;
} else{
    max=y;
}
        for (int i = 1; i <=max ; i++) {
            if(x%i==0 && y%i==0){
                hcf=i;
            }
        }
        lcm=(x*y)/hcf;
        System.out.println("hcf = "+hcf);
        System.out.println("lcm = "+lcm);
    }
}
