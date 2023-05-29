import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Randomfile {
    private static final String[] STATES = {"CA", "NY", "TX", "FL", "IL"};
    private static final String[] CITIES = {"LosAngeles", "NewYorkCity", "Houston", "Miami", "Chicago"};
    private static final String[] COUNTIES = {"LosAngelesCounty", "NewYorkCounty", "HarrisCounty", "Miami-DadeCounty"};
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public  void generateRandomLocationFile() {
        String filename = "random_location_file.csv";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Action,LocationCode,LocationName,StreetAddress,ApartmentSuit,City,State,ZipCode,Primary,Everify,County,Status,HrUserId,EmployerCode\n");

            Random random = new Random();
            for (int i = 1; i <= 5; i++) {
                String locationCode = generateLocationCode();
                String locationName = "Location" + i;
                String streetAddress = "StreetAddress" + i;
                String apartmentSuit = "AptSuite" + i;
                String city = CITIES[random.nextInt(CITIES.length)];
                String state = STATES[random.nextInt(STATES.length)];
                String zipCode = String.format("%05d", random.nextInt(100000));
                String primary = "false";
                String everify = "false";
                String county = COUNTIES[random.nextInt(COUNTIES.length)];
                String status = random.nextBoolean() ? "Active" : "active";
                String hrUserId = "";
                String employerCode = "";

                String line = String.format("Add,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n",
                        locationCode, locationName, streetAddress, apartmentSuit, city, state, zipCode, primary,
                        everify, county, status, hrUserId, employerCode);
                writer.write(line);
            }
        } catch (IOException e) {
            System.out.println("Error occurred while generating the location file: " + e.getMessage());
        }
    }

    public String randomString() {
        int stringLength = 3;

        Random random = new Random();
        StringBuilder sb = new StringBuilder(stringLength);

        for (int i = 0; i < stringLength; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();

    }

    public String generateLocationCode() {
        StringBuilder sb = new StringBuilder();
        String getLocationName = randomString();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int digit = random.nextInt(10);
            sb.append(digit);
        }
        return getLocationName + sb.toString();
    }
}


