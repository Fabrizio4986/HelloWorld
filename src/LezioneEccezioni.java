public class LezioneEccezioni {
    public static void main (String[] args) {
        int[] numeri = {1, 2, 3};

        try {
            double risultato = 10 / 0;
            System.out.println(numeri[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("L'indice " + e.getMessage() + " non è presente nell'array");
        } catch (ArithmeticException e) {
            System.out.println("Nessun numero è divisibile per zero");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("L'operazione è completata!");
        }
    }
}
