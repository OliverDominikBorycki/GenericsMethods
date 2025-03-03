public class GenericUtils <T> {
    public  <T> void reverse (T[] array) {
        int erstes =0;
        int letztes = array.length -1;
        while (erstes<letztes) {
            T temp = array[erstes];
            array[erstes] = array[letztes];
            array[letztes] = temp;
            erstes++;
            letztes--;
        }
    }
    public  <T extends java.lang.Number> double sum (T[] array) {
        double zaehler = 0;
        for (int i=0;i< array.length;i++) {
            zaehler += array[i];
        }
        return zaehler;
    }
}
