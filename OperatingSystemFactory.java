import com.phone.OS;

public class OperatingSystemFactory {
    public OS getInstance(String sr)
    {
        if(sr.equals("OPEN_AD"))
        return new Android();
        else if(sr.equals("CLOSED IOS"))
        return new IOS();
        else
            return new Windows();
    }
}
