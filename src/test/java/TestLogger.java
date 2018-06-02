import junit.framework.TestCase;
import org.edi.freamwork.log.APPLogger;
import org.edi.freamwork.log.LogFileName;
import org.edi.freamwork.log.LoggerUtils;
import org.junit.Test;
import org.slf4j.Logger;

/**
 * @author Fancy
 * @date 2018/6/2
 */
public class TestLogger extends TestCase {

    //https://blog.csdn.net/mggwct/article/details/77718122
    @Test
    public void testELogger(){
        APPLogger appLogger = new APPLogger();
        appLogger.ELogger("this is test");
    }

    @Test
    public void testDifPathLog(){
        Logger ysyjLogger = LoggerUtils.Logger(LogFileName.YSYJ);
        Logger avaLogger = LoggerUtils.Logger(LogFileName.AVA);

        ysyjLogger.info("YSYJ's log");
        avaLogger.info("AVA's log");

        ysyjLogger.error("YSYJ's error log");
        avaLogger.error("AVA's error log");
    }

}
