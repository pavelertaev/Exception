public class Data {
    public static void validate(String login,String password,String confirmPassword) throws WrongLoginException , WrongPasswordException {
       if(isFormat(login)){
           System.out.println("Логин верный");
       }else{
           throw new WrongLoginException("Не верный логин");
       }
       if(isFormat(password)){
           System.out.println("Пароль верный");
       }else {
           throw new WrongPasswordException("Пароль не верный");
       }
       if(!password.equals(confirmPassword)){
           throw new WrongPasswordException("Не совпадают пароли");
       }
        System.out.println("Создать профиль");


    }
    private static boolean isFormat(String str){
        return str.matches("\\w{1,20}");
    }
}
