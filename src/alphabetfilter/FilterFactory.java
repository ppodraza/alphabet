package alphabetfilter;

public final class FilterFactory {
    
    public CharFilter getFilter(String cmd) {
        switch(cmd) {
            case "even":
                return new EvenCharFilter();
            case "odd":
                return new OddCharFilter();
            default:
                throw new IllegalArgumentException("Unknown command!");
        }
    }  
    
}
