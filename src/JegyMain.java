import com.flowacademy.jegy.*;
import java.util.ArrayList;
import java.util.List;

public class JegyMain {
    public static void main(String[] args) {
        List<Jegy> jegyek = new ArrayList<Jegy>();

        for (int i = 0; i < args.length; i+=4) {
            String jegyTipusa = args[i];
            String celallomas = args[i+1];
            int kilometer = Integer.parseInt(args[i+2]);
            int kedvezmeny = Integer.parseInt(args[i+3]);

            if (jegyTipusa.equals("return")) {
                ReturnJegy returnjegy = new ReturnJegy(kilometer, celallomas, kedvezmeny);
                jegyek.add(returnjegy);
            } else if (jegyTipusa.equals("simple")) {
                Jegy jegy = new Jegy(kilometer, celallomas, kedvezmeny);
                jegyek.add(jegy);
            }
        }

        float legdragabb = jegyek.get(0).arKiszamit();
        int index = 0;
        for (int i = 0; i < jegyek.size(); i++) {
            if (jegyek.get(i).arKiszamit() > legdragabb) {
                index = i;
            }
        }

        System.out.println("A legdrágább jegy: " + jegyek.get(index));
    }
}
