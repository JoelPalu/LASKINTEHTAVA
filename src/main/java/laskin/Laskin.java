package laskin;

public class Laskin {

    private int tulos;  	// Muuttuja tulokselle

    public void nollaa() {  // Nollaa tulosmuuttuja
        tulos = 0;
    }

    public int annaTulos() {
        return tulos;
    }

    public void lisaa(int n) {
        tulos = tulos + n;
    }

    public void vahenna(int n) {
        tulos = tulos - n;
    }

    public void kerro(int n) {

        tulos = n * tulos;
    }

    public void jaa(int n) {
    	if (n==0) throw new ArithmeticException("Nollalla ei voi jakaa");
        tulos = tulos / n;
    }

    public void nelio(int n) {
        tulos = n * n;
    }

    public void neliojuuri(int n) {
        if (n < 0) throw new ArithmeticException("Negatiivisella luvulla ei ole neliöjuurta");
        tulos = (int) Math.sqrt(n);
    }

    public void virtaON() {
        // Tähän voisi laittaa alkutoimet
        tulos = 0;
    }

    public void virtaOFF() {
        // Tähän voisi laittaa lopputoimet
    }

    public static void main(String[] args) {
        Laskin laskin = new Laskin();

        laskin.virtaON();
        System.out.println("...Virta päälle...");

        laskin.lisaa(500);
        System.out.println("Lisää 500    = " + laskin.annaTulos());

        laskin.lisaa(200);
        System.out.println("Lisää 200    = " + laskin.annaTulos());

        laskin.vahenna(100);
        System.out.println("Vähennä 100  = " + laskin.annaTulos());

        laskin.jaa(2);
        System.out.println("Jaa 2:lla    = " + laskin.annaTulos());

        laskin.kerro(10);
        System.out.println("Kerro 10:llä = " + laskin.annaTulos());

        System.out.println("...Nollataan...");
        laskin.nollaa();

        laskin.lisaa(500);
        System.out.println("Lisää 500    = " + laskin.annaTulos());

        laskin.virtaOFF();
        System.out.println("...Katkaistaan virta...");
    }


}


