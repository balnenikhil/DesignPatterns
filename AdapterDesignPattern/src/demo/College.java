package demo;

public class College {
    public static void main(String[] args) {
        SmartShare smartShareAdapter = new SmartShareAdapter();
        Assignment assignment = new Assignment();
        assignment.setSmartShare(smartShareAdapter);
        assignment.submitAssignment("submitting through SmartShare");

    }
}


//Two incompatible things gets attached through one separate entity called adapter.
//It allows reuse ability of existing functionality.

