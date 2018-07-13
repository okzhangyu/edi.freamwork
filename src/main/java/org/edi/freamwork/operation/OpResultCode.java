package org.edi.freamwork.operation;

/**
 * @author Fancy
 * @date 2018/7/13
 * 操作结果编码
 */
public class OpResultCode {
    /*
    *  1、  0 -成功
    *  2、  第一位编码如下（以后有需要递增）：
    *            网络层=》service层=》repository层=》mapper  通用
    *           1          2          3              4        5
    *  3、  第二位编码如下（以后有需要递增）：
    *            1、错误 如：校验错误
    *            2、异常
    *  4、   第三、四位为具体错误：
    *           如：token为空，编码规定为01，那么具体的编码为1101.
    **/

    /**
     * 成功
     */
    public static final String SUCCESS = "0";


    /**
     * 对象为空
     */
    public static final String OBJECT_IS_EMPTY = "5101";





}
