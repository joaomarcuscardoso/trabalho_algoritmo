package connectmeJoaoeLuis.Helper;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * Busca a solu��o por busca em largura.
 *
 *  @author Jomi Fred H�bner
 *  
 *  Tratamento com Tipos genericos adicionados por Adilson Vahldick.
 *  
 */
public class BuscaLargura<E extends Estado> extends Busca<E> {
    
    /** busca sem mostrar status */
    public BuscaLargura() {
    }
    
    /** busca mostrando status */
    public BuscaLargura(MostraStatusConsole ms) {
        super(ms);
    }

    public Nodo busca(E inicial) {
        status.inicia();
        initFechados();
       
        Queue<Nodo> abertos = new PriorityQueue<Nodo>();
        
        abertos.add(new Nodo(inicial, null));
        
        while (!parar && abertos.size() > 0) {
            
            //System.out.print("abertos "+abertos);
            Nodo n = abertos.remove();
            //System.out.println("pegando "+n);
            status.explorando(n, abertos.size());
            if (n.estado.ehMeta()) {
                status.termina(true);
                return n;
            }
                        
            abertos.addAll( sucessores(n) );
        }
        status.termina(false);
        return null;
    }
    
    public String toString() {
    	return "BL - Busca em Largura";
    }
}
