import javax.swing.*;
import java.util.Locale;

public class Vaccine {
    public static void main(String[] args) {
        String vaccine = JOptionPane.showInputDialog("Please input vaccine name (BNT, AZ, MVC):");
        vaccine = vaccine.toLowerCase();

        if(vaccine.equals("bnt")){
            JOptionPane.showInputDialog(null,"BNT mRAN疫苗 保護力:95%");
        }else if(vaccine.equals("az")){
            JOptionPane.showInputDialog(null,"AZ 腺病毒疫苗疫苗 保護力:81%");
        }else if(vaccine.equals("mvc")){
            JOptionPane.showInputDialog(null,"高端 重組棘蛋白疫苗 保護力:未知");
        }else {
            JOptionPane.showInputDialog(null,"無法辨識你的輸入，請重新輸入BNT, AZ, MVC");
        }
    }
}