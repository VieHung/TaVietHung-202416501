import javax.swing.JOptionPane;
public class He2an_2phuongtrinh {
    public static void main(String[] args){
        String strHeso11 = JOptionPane.showInputDialog(null,
		"Nhap vao he so 11: ","Nhap he so 11",
		JOptionPane.INFORMATION_MESSAGE);

        String strHeso12 = JOptionPane.showInputDialog(null,
		"Nhap vao he so thu 12: ","Nhap he so 12",
		JOptionPane.INFORMATION_MESSAGE);
        
        String strHeso13 = JOptionPane.showInputDialog(null,
		"Nhap vao he so 13: ","Nhap he so 13",
		JOptionPane.INFORMATION_MESSAGE);

        String strHeso21 = JOptionPane.showInputDialog(null,
		"Nhap vao he so 21: ","Nhap he so 21",
		JOptionPane.INFORMATION_MESSAGE);

        String strHeso22 = JOptionPane.showInputDialog(null,
		"Nhap vao he so 22: ","Nhap he so 22",
		JOptionPane.INFORMATION_MESSAGE);

        String strHeso23 = JOptionPane.showInputDialog(null,
		"Nhap vao he so 23: ","Nhap he so 23",
		JOptionPane.INFORMATION_MESSAGE);

        double a11 = Double.parseDouble(strHeso11);
        double a12 = Double.parseDouble(strHeso12);
        double b1  = Double.parseDouble(strHeso13);
        double a21 = Double.parseDouble(strHeso21);
        double a22 = Double.parseDouble(strHeso22);
        double b2  = Double.parseDouble(strHeso23);

        String strVosonghiem = "Vo so nghiem";
        String strVonghiem = "Vo nghiem";

        double D,D1;
        D=a11*a22-a12*a21;
        D1=a12*b2-b1*a22;
        double x1;
        double x2;
        
        if (D == D1) {
            if (D == 0) {
                JOptionPane.showMessageDialog(null,strVosonghiem,
		"Phuong trinh vo so nghiem", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                x2 = (b1*a21-b2*a11)/(a12*a21-a22*a11);
                x1 = (b1*a22-b2*a12)/(a11*a22-a21*a12);
                JOptionPane.showMessageDialog(null,"Phuong trinh co nghiem x1= " + x1 + "\nPhuong trinh co nghiem x2= " + x2 ,
		"Phuong trinh vo nghiem", JOptionPane.INFORMATION_MESSAGE);

            }
        }

        else {
            JOptionPane.showMessageDialog(null,strVonghiem,
		"Phuong trinh vo nghiem", JOptionPane.INFORMATION_MESSAGE);
        }

    System.exit(0);
    }
}
