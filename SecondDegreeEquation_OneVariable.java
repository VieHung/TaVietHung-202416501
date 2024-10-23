import javax.swing.JOptionPane;
public class SecondDegreeEquation_OneVariable {
    public static void main(String[] args){
        String strHeso1 = JOptionPane.showInputDialog(null,
		"Nhap vao he so thu 1: ","Nhap he so 1",
		JOptionPane.INFORMATION_MESSAGE);

        String strHeso2 = JOptionPane.showInputDialog(null,
		"Nhap vao he so thu 2: ","Nhap he so 2",
		JOptionPane.INFORMATION_MESSAGE);

        String strHeso3 = JOptionPane.showInputDialog(null,
		"Nhap vao he so thu 3: ","Nhap he so 3",
		JOptionPane.INFORMATION_MESSAGE);


        double a = Double.parseDouble(strHeso1);
        double b = Double.parseDouble(strHeso2);
        double c = Double.parseDouble(strHeso3);
        double D;
        D= b*b-4*a*c;
        double sqrt_D = Math.sqrt(D);

        String strVosonghiem = "Vo so nghiem";
        String strVonghiem = "Vo nghiem";

        if (a == 0 && b == 0 ) {
            if (c == 0){
                JOptionPane.showMessageDialog(null,strVosonghiem,
		    "Phuong trinh vo so nghiem", JOptionPane.INFORMATION_MESSAGE);
        }
            else  {
                JOptionPane.showMessageDialog(null,strVonghiem,
		    "Phuong trinh vo nghiem", JOptionPane.INFORMATION_MESSAGE);
        }
        }
        else if (a == 0 && b != 0) {
            double x = (-c)/b;
            JOptionPane.showMessageDialog(null,"Phuong trinh co nghiem x= " + x,
		"Phuong trinh co nghiem", JOptionPane.INFORMATION_MESSAGE);
        }

        else {
            if (D<0) {
                JOptionPane.showMessageDialog(null,strVonghiem,
		    "Phuong trinh vo nghiem", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (D==0) {
                double x = (-b)/(2*a);
            JOptionPane.showMessageDialog(null,"Phuong trinh co nghiem x= " + x,
		"Phuong trinh co nghiem", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                double x1,x2;
                x1 = (-b+sqrt_D)/(2*a);
                x2 = (-b-sqrt_D)/(2*a);
                JOptionPane.showMessageDialog(null,"Phuong trinh co nghiem x1= " + x1 + "\nPhuong trinh co nghiem x2= " + x2,
		"Phuong trinh co nghiem", JOptionPane.INFORMATION_MESSAGE);
            } 
        }

    System.exit(0);
    }
}
