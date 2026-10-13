public class DrugDosageCalculator {
    //this class will have a public method that takes a patient object and a drug object as parameters and calculates and returns the specific dosage of that drug for that patient, in mg. The age of the patient reduces the dosage by 2% per year over 65 due to reduced kidney function.
    // As this class has no fields, this method would probably be better as a 'static' class method, but we've not covered those yet
    public double calculateDosage(Patient patient, Drug drug) {
        double dosage = drug.getDosage() * patient.getWeight();
        if (patient.getAge() > 65) {
            dosage = dosage * (1 - (patient.getAge() - 65) * 0.02);
        }
        return dosage;
    }

}
