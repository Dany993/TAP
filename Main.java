public class Main {
    public static void main(String[] args) {

        Pagina pagina = new Pagina("paragraf 1 ");

        Paragraf paragraf= pagina;

        paragraf.appendText("adaugara text in paragraf 1");

        Paragraf paragraf1 = new Paragraf("Paragraf 2 ");

        paragraf1.appendText("adaugare text in paragraf 2");

        pagina.display();

        paragraf.display();

        paragraf1.display();
    }
}
