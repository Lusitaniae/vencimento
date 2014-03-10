

package vencimentos;
import javax.swing.JOptionPane;
public class TesteVencimentos {
public static int i;
   
    public static void main(String[] args) {
        TrabPeca tp = new TrabPeca("Jorge Silva", 20, 30);
        TrabCom tc = new TrabCom("Susana Ferreira", 500f, 1500f, 6);
        TrabHora th = new TrabHora("Carlos Miguel", 160, 3.5f);
        
        Object[] trabs = new Object[10];
        
        //(Trabalhador)trabs;
        trabs[0] = tp;
        trabs[1] = tc;
        trabs[2] = th;
        
        //Todos os trabalhadores
        for(int i=0;i<trabs.length;i++){
            if(trabs[i] != null)
                System.out.println(trabs[i].toString());
        }
        //Trabalhadores à hora
        System.out.println("\n\nTrabalhadores à hora:");
        for(int i=0;i<trabs.length;i++){
            
            if(trabs[i] instanceof TrabHora)
                System.out.println(trabs[i].toString());
        }
        //Nomes e vencimentos
        System.out.println();
        for(int i=0;i<trabs.length;i++){
            if(trabs[i] != null)
                System.out.println(((Trabalhador)trabs[i]).getNome() + ": " +
                        ((Trabalhador)trabs[i]).vencimento() + " €");
            
        }
        
        
        
        Trabalhador[] trabx = new Trabalhador[10];
        
       
        trabx[0] = tp;
        trabx[1] = tc;
        trabx[2] = th;
        
        //Todos os trabalhadores
        for(int i=0;i<trabx.length;i++){
            if(trabx[i] != null)
                System.out.println(trabx[i].toString());
        }
        //Trabalhadores à hora
        System.out.println("\n\nTrabalhadores à hora:");
        for(int i=0;i<trabx.length;i++){
            
            if(trabs[i] instanceof TrabHora)
                System.out.println(trabx[i].toString());
        }
        //Nomes e vencimentos
        System.out.println();
        for(int i=0;i<trabx.length;i++){
            if(trabx[i] != null)
                System.out.println(trabx[i].getNome() + ": " +
                        trabx[i].vencimento() + " €");
            
        }
        
        
        TrabPeca tpx = new TrabPeca(tp);
        tpx.equals(tp);
            
    }
    
}
