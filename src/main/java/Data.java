import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public enum Data {

    AUTHOR(), DATE(), MESSAGE(), MESSAGETYPE();

    public String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    Data() {
        this.value = value;
    }
}
