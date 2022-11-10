package bmi;
public class BMI {
    public static void main(String[] args) {
      int beratbadan = 64;
      float tinggibadan = 1.72f;
      float bmi=(beratbadan/(tinggibadan*tinggibadan));
      
      System.out.println("BMI ANDA ADALAH\t:"+bmi);
      
      if (bmi<18.5){
          System.out.println("BERAT BADAN ANDA KURANG");
      }
      else if (bmi<24.9){
          System.out.println("BERAT BADAN ANDA NORMAL/IDEAL");
      }
      else if (bmi<29.9){
          System.out.println("BERAT BADAN ANDA LEBIH");
      }
      else{
          System.out.println("OBESITAS");
      }
      }
    
}
