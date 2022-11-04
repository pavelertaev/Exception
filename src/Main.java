public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        try {
            Data.validate("fdfdfdf","12333","123334");
        }catch (WrongLoginException e){
            System.out.println("Ошибка логина");
        }catch (WrongPasswordException e) {
            System.out.println("Ошибка пароля " + e.getMessage());
        }
    }
}