public class Waiter extends Chef{
    public void modifyPrice(String be, int ar){
        for (int i=0; i<menu.size(); i++) {
            if (be== menu.get(i).recipe){
                menu.get(i).price= ar;
            }
        }
    }
}
