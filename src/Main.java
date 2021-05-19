import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int numOfTests = Integer.parseInt(in.readLine());

        in.lines()
                .limit(numOfTests)
                .map(n -> Integer.parseInt(n))
                .forEach(n -> System.out.println(KamenetskyFormula(n)));
    }

    private static long KamenetskyFormula(int n) {
        if (n < 2) {
            return 1;
        }
        double x = n * Math.log10(n / Math.E) + Math.log10(2 * Math.PI * n) / 2.0;
        return (long) (Math.floor(x) + 1);
    }
}
