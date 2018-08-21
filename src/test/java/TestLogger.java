import junit.framework.TestCase;
import org.edi.freamwork.log.LogFileName;
import org.edi.freamwork.log.LoggerUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        Logger ysyjLogger = LoggerUtils.Logger("ysyj");
        Logger logger = LoggerFactory.getLogger(TestLogger.class);
        logger.info("this is info");
        logger.warn("this is ware");
        logger.error("this is bug");
        logger.debug("this is debug");
        avaLogger.info("AVA's log");
        avaLogger.error("AVA's error log");
        edfLogger.info("EDF's log");
        //edfLogger.info(new  Exception("this is eeror"));
        edfLogger.error("EDF's error");
        ysyjLogger.info("YSYJ's info");
        ysyjLogger.error("YSYJ's error");
    }

}
