package p02;

public class C02 {
    /*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
    public static void main(String[] args) {
        String harfler="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char a=harfler.charAt(harfler.indexOf("A"));
        char l=harfler.charAt(harfler.indexOf("L"));
        char i=harfler.charAt(harfler.indexOf("I"));

        System.out.println(a+ " "+l+ " "+i);
    }
}
