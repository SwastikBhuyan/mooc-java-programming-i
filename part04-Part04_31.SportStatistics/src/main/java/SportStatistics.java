
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String file = scan.nextLine();
        String team = scan.nextLine();
        System.out.println("Games: " + noOfMatches(file, team));
        System.out.println("Wins: " + wins(file, team));
        System.out.println("Losses: " + losses(file, team));
    }

    public static int noOfMatches(String file, String team) {
        ArrayList<Match> matches = new ArrayList<>();
        try ( Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int awayTeamPoints = Integer.valueOf(parts[3]);

                matches.add(new Match(homeTeam, awayTeam, homeTeamPoints, awayTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        int count = 0;
        for (Match match : matches) {
            if (match.getHomeTeam().equals(team) || match.getAwayTeam().equals(team)) {
                count += 1;
            }
        }
        return count;
    }

    public static int wins(String file, String team) {
        ArrayList<Match> matches = new ArrayList<>();
        try ( Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int awayTeamPoints = Integer.valueOf(parts[3]);

                matches.add(new Match(homeTeam, awayTeam, homeTeamPoints, awayTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        int count = 0;
        for (Match match : matches) {
            if (match.getHomeTeam().equals(team)) {
                if (match.getHomeTeamPoints() - match.getAwayTeamPoints() > 0) {
                    count += 1;
                }
            } else if (match.getAwayTeam().equals(team)) {
                if (match.getAwayTeamPoints() - match.getHomeTeamPoints() > 0) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public static int losses(String file, String team) {
        ArrayList<Match> matches = new ArrayList<>();
        try ( Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int awayTeamPoints = Integer.valueOf(parts[3]);

                matches.add(new Match(homeTeam, awayTeam, homeTeamPoints, awayTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        int count = 0;
        for (Match match : matches) {
            if (match.getHomeTeam().equals(team)) {
                if (match.getHomeTeamPoints() - match.getAwayTeamPoints() < 0) {
                    count += 1;
                }
            } else if (match.getAwayTeam().equals(team)) {
                if (match.getAwayTeamPoints() - match.getHomeTeamPoints() < 0) {
                    count += 1;
                }
            }
        }
        return count;
    }

}
