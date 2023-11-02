package sizes;

public class SizeFactory {
    public static Size createSize(String type) {
        switch (type) {
            case "tall": return new Tall();
            case "venti": return new Venti();
            case "grande": return new Grande();
        }
        return null;
    }
}
