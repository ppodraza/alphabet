package alphabetfilter;

public class Runner {

    private static final FilterFactory filterFactory = new FilterFactory();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Invalid number of arguments!");
            return;
        }
        
        final String cmd = args[0];
        CharFilter filter;
        
        try {
            filter = filterFactory.getFilter(cmd);
        } catch(RuntimeException ex) {
            System.out.println(ex.getMessage());
            return;
        } 
         
        for(char c = 'a'; c <= 'z'; c++) 
            System.out.println(filter.execute(c));
    }
    
}
