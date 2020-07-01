import cn.TestClass;
import org.testng.annotations.Test;

/**
 * @Author: dyliu
 * @Description: ut
 * @Date: 14:54 2020/7/1
 **/
public class TestJaCoCo {

    @Test
    public void test() {
        TestClass testClass = new TestClass();
        testClass.test("lilei");
        testClass.test("hanmeimei");
    }
}
