import javax.swing.JOptionPane;
public class PontoEletronico {
	public static void main(String[] args) {
		   int hora_primeiroponto, hora_ultimoponto, minuto_primeiroponto, minuto_ultimoponto, horas, minutos, tempointervalo, total;
		    
		   hora_primeiroponto = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial: "));
		   minuto_primeiroponto = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial: "));		   
		   hora_ultimoponto = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final: "));		   
		   minuto_ultimoponto = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final: "));
		   tempointervalo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de intervalo: "));
		   
		
		   if (hora_ultimoponto >= hora_primeiroponto) {
			   horas = hora_ultimoponto - hora_primeiroponto;
		   }
		   else {
			   horas = hora_ultimoponto + 24 - hora_primeiroponto;
		   }  
		
			if (minuto_ultimoponto >= minuto_primeiroponto){
				minutos = minuto_ultimoponto - minuto_primeiroponto;
			}
			else {
				minutos = minuto_ultimoponto + 60 - minuto_primeiroponto;
			}
			total = horas - tempointervalo;
			System.out.println(total);
			System.out.println(horas);
			System.out.println(tempointervalo);
			JOptionPane.showMessageDialog(null, "Você trabalhou: "+horas+"horas e "+minutos+"minutos");
	
	}
}
