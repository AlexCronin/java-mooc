
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String fileName = scan.nextLine();
        
        ArrayList<String> matchStatistics = new ArrayList<>();

        // we create a scanner for reading the file
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            // we read all the lines of the file
            while (scanner.hasNextLine()) {
                matchStatistics.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Team:");
        String team = scan.nextLine();
        int gameCount = 0;
        int winCount = 0;
        int lossCount = 0;
        for(String mS : matchStatistics) {
            if(mS.contains(team)) {
                gameCount++;
                
                String[] parts = mS.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);
                
                if(homeTeam.equals(team) && homePoints > awayPoints) {
                    winCount++;
                } else if(awayTeam.equals(team) && homePoints < awayPoints) {
                    winCount++;
                } else if(homePoints == awayPoints) {
                    continue;
                } else{
                    lossCount++;
                }
                
            }
        }
        
        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);
        
    }

}
