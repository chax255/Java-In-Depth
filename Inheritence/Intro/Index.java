package Inheritence.Intro;

public class Index {
    public static void main(String[] hujuiBhana) {
        System.out.println("Karibu kwenye system ya taarifa zako: \n");
        Mwanzo mtu = new Mwanzo();
        Mwanzo jose = new Mwanzo("Joseph",12);
        Mwanzo chax = new Mwanzo("Unyama",12,164);
        Mwanzo.printInners(jose);
        Mwanzo.printInners(mtu);
        Mwanzo.printInners(chax);
    }
}
