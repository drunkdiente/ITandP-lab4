public class ExceptionArithmeticMean {
    public static void main(String[] args){
        int[] a = {5,6,9,20};
        int sum = 0;
        double result = 0;
        a = null;

        try {
            for (int i = 0; i < a.length; i++){
                sum += a[i];
            }
            result = (double) sum / a.length;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds");
            e.printStackTrace();
        } catch(NullPointerException e){
            System.out.println("Object has not been initialized");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
