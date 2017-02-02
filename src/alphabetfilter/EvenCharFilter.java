package alphabetfilter;

public final class EvenCharFilter implements CharFilter {

    @Override
    public boolean execute(char element) {
        return element % 2 == 0;
    }
    
}
