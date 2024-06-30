
public class GradeDistribution {
    
    private PointList pointList;
    
    public GradeDistribution(PointList pointList) {
        this.pointList = pointList;
    }
    
    public String[] gradeDelegation() {
        
        String grade5 = "";
        String grade4 = "";
        String grade3 = "";
        String grade2 = "";
        String grade1 = "";
        String grade0 = "";
        
        for (int point : pointList.getPointList()) {
            
            if (point >= 50 && point < 60) {
                grade1 += "*";
            }
            
            if (point >= 60 && point < 70) {
                grade2 += "*";
            }
            
            if (point >= 70 && point < 80) {
                grade3 += "*";
            }
            
            if (point >= 80 && point < 90) {
                grade4 += "*";
            }
            
            if (point >= 90) {
                grade5 += "*";
            }
            
            if (point < 50) {
                grade0 += "*";
            }
        }
        
        String[] allGrades = {grade0, grade1, grade2, grade3, grade4, grade5};
        
        return allGrades;
    }
    
    public String toString() {
        String[] allGrades = gradeDelegation();
        return ("5: " + allGrades[5] + "\n" +
                "4: " + allGrades[4] + "\n" +
                "3: " + allGrades[3] + "\n" +
                "2: " + allGrades[2] + "\n" +
                "1: " + allGrades[1] + "\n" +
                "0: " + allGrades[0] + "\n" );
    }
    
    
}
