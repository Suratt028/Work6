
public class DayMonthYear {
    
    private String day;
    private String month;
    private String year;
    private int numberOfDay;
    private int numberOfMonth;

    
    public DayMonthYear(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.numberOfDay = calculateAmountOfDay(day, month, year);
        this.numberOfMonth = calculateAmountOfMonth(day, month, year);
    }

    
    public DayMonthYear(String month, String year) {
        this("1", month, year); 
    }

    
    public DayMonthYear(String year) {
        this("1", "1", year); 
    }

    
    public void setDay(String day) {
        this.day = day;
    }

    
    public String getDay() {
        return this.day;
    }

    
    public void setMonth(String month) {
        this.month = month;
    }

    
    public String getMonth() {
        return this.month;
    }

    
    public void setYear(String year) {
        this.year = year;
    }

    
    public String getYear() {
        return this.year;
    }

    
    public void show() {
        System.out.println("Day: " + this.day);
        System.out.println("Month: " + this.month);
        System.out.println("Year: " + this.year);
    }

    
    public int calculateAmountOfDay(String day, String month, String year) {
        // แปลงข้อความเป็นตัวเลข
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);

        
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        
        if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) {
            
            daysInMonth[1] = 29;
        }

        
        int sum = 0;

      
        for (int i = 0; i < m - 1; i++) {
            sum += daysInMonth[i];
        }

        
        sum += d;

       
        return sum;
    }

   
    public int calculateAmountOfMonth(String day, String month, String year) {
        
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);

        
        int sum = 0;

   
        for (int i = 1; i < m; i++) {
            sum++;
        }

        
        if (d > 15) {
            
            sum++;
        }

        
        return sum;
    }
}
