import javax.swing.JOptionPane;
public class FirstDegreeEquation_OneVariable {
    public static void main(String[] args){
        String strHeso1 = JOptionPane.showInputDialog(null,
		"Nhap vao he so thu 1: ","Nhap he so 1",
		JOptionPane.INFORMATION_MESSAGE);

        String strHeso2 = JOptionPane.showInputDialog(null,
		"Nhap vao he so thu 2: ","Nhap he so 2",
		JOptionPane.INFORMATION_MESSAGE);

        double Heso1 = Double.parseDouble(strHeso1);
        double Heso2 = Double.parseDouble(strHeso2);
        String strVosonghiem = "Vo so nghiem";
        String strVonghiem = "Vo nghiem";

        if (Heso1 == 0 && Heso2 == 0) {
            JOptionPane.showMessageDialog(null,strVosonghiem,
		"Phuong trinh vo so nghiem", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (Heso1 == 0 && Heso2 !=0) {
            JOptionPane.showMessageDialog(null,strVonghiem,
		"Phuong trinh vo nghiem", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            double x = (-Heso2)/Heso1;
            JOptionPane.showMessageDialog(null,"Phuong trinh co nghiem x= " + x,
		"Phuong trinh co nghiem", JOptionPane.INFORMATION_MESSAGE);
        }
    System.exit(0);
    }
}
