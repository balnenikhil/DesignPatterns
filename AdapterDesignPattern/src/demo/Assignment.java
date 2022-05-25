package demo;

public class Assignment {
    private SmartShare smartShare;

    public SmartShare getSmartShare() {
        return smartShare;
    }

    public void setSmartShare(SmartShare smartShare) {
        this.smartShare = smartShare;
    }

    public void submitAssignment(String file)
    {
        smartShare.upload(file);
    }
}
