import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String toString() {
        return regCode + " " + country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof RegistrationPlate)) {
            return false;
        }

        RegistrationPlate other = (RegistrationPlate) o;
        return this.regCode.equals(other.regCode) && this.country.equals(other.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regCode, country);
    }

}

class Main4 {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<>();
        finnish.add(reg1);
        finnish.add(reg2);

        // New registration plate to check
        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }
        System.out.println("Finnish: " + finnish);

        // HashMap to store the owners of the plates
        HashMap<RegistrationPlate, String> owners = new HashMap<>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        // Retrieve owners based on the plates
        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123"))); // Should return "Arto"
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));  // Should return "Jürgen"
    }
}

