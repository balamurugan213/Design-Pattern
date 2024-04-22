import Memento.Editor;
import Memento.History;
import oops.*;

public class Main {

    public void  oopsRun(){
//        class Example
        User a=new User("Bala");
        a.sasyHallow();

//       Interface example
        TaxCalculator calc =new Calc2023();
        calc.calcuylateTax();

//        Encapsulation Example
        Account acc1=new Account();
        acc1.setBalance(100);
        System.out.println("Balance"+acc1.getBalance());

//        Abstraction Example
        MailService service =new MailService();
        service.senEmail();

//        Inheritance
        var textbox=new TextBox();
        textbox.enable();

//        Polymorphism
        DrawUiControl(new TextBox());
        DrawUiControl(new CheckBox());

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main a= new Main();
//        a.oopsRun();

        var editor =new Editor();
        var history =new History();

        editor.setContent("a");

        history.push(editor.createState());
        editor.setContent("b");


        history.push(editor.createState());
        editor.setContent("c");

//        history.push(editor.createState());
        editor.restore(history.pop());
        System.out.println(editor.getContent());

    }
    public static void DrawUiControl(UiControl control){
        control.draw();
    }
}