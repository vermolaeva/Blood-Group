public class Patient {
    private String id;
    private int age;
    private BloodGroup bloodGroup;

    private BloodGroup rhFactor;

    public Patient(String id, int age, String bType, String rhFactor) {
        this.id = "0";
        this.age = 0;
        this.bloodGroup = new BloodGroup(bType, rhFactor);
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int Age) {
        this.age = age;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup b) {
        this.bloodGroup = b;

    }

    public BloodGroup getRhFactor() {
        return rhFactor;
    }





    }



