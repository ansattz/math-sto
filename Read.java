import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class Read {

   public static void main(String[] args) {
      while (true) {
         String op = JOptionPane.showInputDialog(null, "Escolha um pdf",
               "Notas em Matematica", JOptionPane.PLAIN_MESSAGE, null,
               new Object[] {
                     "Algebra",
                     "Teoria dos Conjuntos" },
               "PDFs").toString();
         switch (op) {
            case "Algebra":
               if (Desktop.isDesktopSupported()) {
                  try {
                     File algebra = new File("algebra/main.pdf");
                     Desktop.getDesktop().open(algebra);
                  } catch (IOException ex) {
                     System.out.println("VSF");
                  }
               }
               break;
            case "Teoria dos Conjuntos":
               if (Desktop.isDesktopSupported()) {
                  try {
                     File stheory = new File("set_theory/main.pdf");
                     Desktop.getDesktop().open(stheory);
                  } catch (IOException ex) {
                  }
               }
               break;
         }
      }
   }
}
