package alphabetfilter;

public final class OddCharFilter implements CharFilter {

    @Override
    public boolean execute(char element) {    
        return element % 2 != 0;
    }

}


