public class NumberConversion {
    public static void main(String[] args) throws CustomNumberFormatException {
        try {
            System.out.println(Integer.parseInt("2"));
            System.out.println(Integer.parseInt("avc"));
        } catch (NumberFormatException e) {
            System.out.println("Неверный тип данных");
            throw new CustomNumberFormatException("Illegal Format, please check your input");
        }

    }



}