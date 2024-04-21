import com.hescha.mugen.defparser.DefParser;
import com.hescha.mugen.defparser.model.DefFile;

public class Main {
    public static void main(String[] args) {
        DefParser p = new DefParser();

        String file1 = "test/1.def";
        String file2 = "test/2.def";
        DefFile parse1 = p.parse(file1);
        DefFile parse2 = p.parse(file2);

        System.out.println(parse1);
        System.out.println(parse2);
    }
}
