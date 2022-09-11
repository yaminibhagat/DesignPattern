import com.phone.OS;
public class FactoryMain
{
    public static void main(String as[])
    {
//    OS obj=new Android();
        OperatingSystemFactory osf = new OperatingSystemFactory();
    //  OS obj = osf.getInstance("OPEN_AD");
          OS obj = osf.getInstance("");
        //    osf.getInstance("CLOSED IOS");
        //OS obj=new Windows();
    obj.spec();
    }

}