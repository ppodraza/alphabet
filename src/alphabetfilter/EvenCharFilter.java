package alphabetfilter;

public final class EvenCharFilter implements CharFilter {

    @Override
    public char execute(char element) {
        return element % 2 == 0 ? element : ' ';
    }
    
}
