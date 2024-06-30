
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private PointList pointList;
    
    
    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.pointList = new PointList();
        
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int point = scanner.nextInt();
            
            if (point == -1) {
                break;
            }
            
            pointList.add(point);
        }
        
        System.out.println("Point average (all): " + pointList.pointAverage());
        System.out.println("Point average (passing): " + pointList.pointAverageforPassed());
        System.out.println("Pass percentage: " + pointList.passPercentage());
        System.out.println("Grade distribution:");
        
        GradeDistribution grades = new GradeDistribution(pointList);
        System.out.println(grades);
    }
}
