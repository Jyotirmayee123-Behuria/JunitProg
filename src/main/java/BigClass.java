public class BigClass {
    private int number = 0;
    private String text = "null";
    public BigClass() {

    }

    public  BigClass(int number) {
        this.number=number;

    }


    public  BigClass(String text) {
        this.text=text;

    }

    public BigClass(int number,String text){
        this.number=number;
        this.text=text;
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String textToUp(String d) {
        d="hi!how r u?";
        System.out.println(d.toUpperCase());
        return d.toUpperCase();
    }
    public String stringVariableNull(String s){
        return  null;

    }
    public int add(int a,int b){
        int sum=0;
        if (a>=0 && b>=0) {
            sum = a + b;
        }
            return sum ;
    }

    @Override
    public String toString() {
        return "BigClass{" +
                "text='" + text + '\'' +
                '}';
    }
}