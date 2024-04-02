public class Paragraf {
    private String text1;

    public Paragraf(String text) {
        text1 = text;
    }

    public Paragraf(String paragraf, String cuvinte) {
        this(paragraf + cuvinte);
    }

    public Paragraf(int numar) {
        this("" + 123);
    }

    void display() {
        System.out.println(text1);
        appendText("aseara am iesit in oras");
        appendText("am iesit in oras", "am venit tarziu");
        appendText(100);
    }

    void appendText(String adaugareText) {
        this.text1 = this.text1 + adaugareText;
    }

    void appendText(int adaugareNumar) {
        this.text1 = this.text1 + adaugareNumar;
        Object numar=new Paragraf(2);

    }
    void appendText(String paragraf, String cuvinte){

    }


}