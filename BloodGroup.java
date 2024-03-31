
public class BloodGroup {
    private String bloodType;
    private String rhFactor;

    enum BloodGroup {
        A, B, AB, O
    }

    enum RhFactor {
        POSITIVE, NEGATIVE
    }
    public BloodGroup() {
        this.bloodType = "0";
        this.rhFactor = "+";
    }

    public BloodGroup(String bType, String rh) {
        this.bloodType = bType;
        this.rhFactor = rh;
    }

    public void setBloodData(String bType) {
        this.bloodType = bType;

    }

    public String getBloodType() {
        return bloodType;
    }

    public void setRhFactor(String rh) {
        this.rhFactor = rh;
    }

    public String getRhFactor() {
        return rhFactor;
    }
}