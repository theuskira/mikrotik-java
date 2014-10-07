package examples;

import java.util.List;
import java.util.Map;
import me.legrange.mikrotik.MikrotikApiException;

/**
 * Example 7: Dump your complete config
 *
 * @author gideon
 */
public class Example8 extends Example {

    public static void main(String... args) throws Exception {
        Example8 ex = new Example8();
        ex.connect();
        ex.test();
        ex.disconnect();
    }

    private void test() throws MikrotikApiException, InterruptedException {
        List<Map<String, String>> res = con.execute("/ip/hotspot/user/print where uptime<00:00:01");
        for (Map<String, String> r : res) {
            System.out.println(r);
        }
    }
}
