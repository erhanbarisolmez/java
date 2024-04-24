public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;

    private String email;
    private String telefonNo;

    public Account() {
        this("bilgi yok", 0.0, "bilgi yok", "bilgi yok", "bilgi yok");
    }

    public Account(
            String hesapNo,
            double bakiye,
            String isim,
            String email,
            String telefonNo) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }

    public Account(String isim, String email, String telefonNo){
        // this.isim=isim;
        // this.email=email;
        // this.telefonNo=telefonNo;

        // this.bakiye=0.0;
        // this.hesapNo="Bilgi yok";

        this("Bilgi Yok", 0.0, isim, email, telefonNo);
        }

    public void bilgileriGoster(){
        System.out.println("Hesap No: " + this.hesapNo);
        System.out.println("Bakiye" + this.bakiye);
        System.out.println("İsim" + this.isim);
        System.out.println("Email" + this.email);
        System.out.println("Telefon Numarası" + this.telefonNo);

    }

    public void paraYatir(double miktar) {
        bakiye += miktar;
        System.err.println("Yeni bakiye: " + bakiye);
    }

    public void paraCekme(double miktar) {
        if (miktar > 1500) {
            System.out.println("Bir günde 1500 tl den fazla para çekemezsiniz...");
        }
        if (miktar - miktar < 0) {
            System.out.println("Yeterli bakiye yok. Bakiye = " + bakiye);
        } else {
            bakiye -= miktar;
            System.out.println("yeni bakiye: " + bakiye);
        }
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

}