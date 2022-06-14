package demo;

public class SmartShareAdapter implements SmartShare{

    Drive drive = new Drive();
    @Override
    public void upload(String file) {
        drive.uploadFile(file);
    }

}
