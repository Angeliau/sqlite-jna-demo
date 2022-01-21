import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.test.jna.bean.Image;
import com.test.jna.sqlite.SqliteClib;
import org.junit.Test;

public class TestCase {

    @Test
    public void sqlite3Test(){
        Pointer p = SqliteClib.INSTANCE.InitDB("1.db");
        Image img = new Image();
        img.name = "javatest123";
        int ret = SqliteClib.INSTANCE.AddImage(p,img);
        System.out.println("ret="+ret);

        ret = SqliteClib.INSTANCE.CloseDB(p);
        System.out.println("ret="+ret);
    }
}
