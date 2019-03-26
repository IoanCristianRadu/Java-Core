package basic.modifiers.access;

public class AccessModifiers {

    //Visible to the package, the default. No basic.modifiers are needed.
    int visibleToThePackage;

    //Visible to the class only (private).
    private int visibleToClass;

    //Visible to the world (public).
    public int visibleToTheWorld;

    //Visible to the package and all subclasses (protected).
    protected int visibleToPackageAndAllSubclasses;

}

interface myInterface {
    //The fields in an interface are implicitly public static final
    public static final String George = "George";

    // and the basic.methods in an interface are by default public.
    public void eat();
}


// Here, if we define openSpeaker() method as private, then it would not be accessible from any other class other than AudioPlayer.
// If we define it as public, then it would become accessible to all the outside world.
// But our intention is to expose this method to its subclass only, that’s why we have used protected modifier.
class Speaker {

}

class AudioPlayer {

    protected boolean openSpeaker(Speaker sp) {
        // implementation details
        return true;
    }
}

class StreamingAudioPlayer {

    boolean openSpeaker(Speaker sp) {
        // implementation details
        return true;
    }
}


