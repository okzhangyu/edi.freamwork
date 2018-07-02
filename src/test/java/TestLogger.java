import junit.framework.TestCase;
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
    public void testDifPathLog(){

        Logger avaLogger = LoggerUtils.Logger(LogFileName.AVA);
        Logger edfLogger = LoggerUtils.Logger("edf");

        avaLogger.info("AVA's log");
        avaLogger.error("AVA's error log");
        edfLogger.info("EDF's log");
        edfLogger.error("EDF's error");
    }

}
