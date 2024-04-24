public class Test{
    public static void main(String[] args){
        Account account1 = new Account();
        Account account2 = new Account("12345", 1000.0, "barış ölmez", "barisolmez@gmail.com", "123123");

        account2.paraCekme(200);
    }
}