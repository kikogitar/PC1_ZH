import java.lang.reflect.Array;
import java.util.ArrayList;

public class Chef {
    public class fogas {
        public String recipe;
        public Integer price;
    }
    ArrayList <fogas> menu = new ArrayList<>();
    public void newRecipe(String nev,Integer ar){
        fogas fogas = new fogas();
        fogas.recipe = nev;
        fogas.price=ar;
        menu.add(fogas);
    }

    public String getMenu() {
        String ki= "";
        for (int i=0; i<menu.size(); i++) {
            ki= ki + menu.get(i).recipe+ " " + menu.get(i).price;
            // csak hogy müködjön a teszter
            if (i!= menu.size()-1) {
                ki= ki +"\r\n";
            }
        }
        return ki;
    }
    public void removeRecipe(String torol) {
        for (int i=0; i<menu.size(); i++) {
            if (torol== menu.get(i).recipe){
                menu.remove(i);
                return;
            }
        }
    }

}
