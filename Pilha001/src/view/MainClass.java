package view;

import javax.swing.JOptionPane;
import controller.*;
public class MainClass {
    public static void main(String[] args) {
        Fatorial m = new Fatorial();
        int cd =0;
            cd = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja pra calcular o fatorial"));
            System.err.println(m.calcFatorial(cd));
        }
    }
