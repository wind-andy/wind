package com.wind.common.core.page;


import com.wind.common.constant.CommonConstants;
import com.wind.common.utils.ServletUtils;

/**
 * 表格数据处理
 * 
 * @author ruoyi
 */
public class TableSupport
{
    /**
     * 封装分页对象
     */
    public static PageDomain getPageDomain()
    {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(CommonConstants.PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(CommonConstants.PAGE_SIZE));
        pageDomain.setOrderByColumn(ServletUtils.getParameter(CommonConstants.ORDER_BY_COLUMN));
        pageDomain.setIsAsc(ServletUtils.getParameter(CommonConstants.IS_ASC));
        return pageDomain;
    }

    public static PageDomain buildPageRequest()
    {
        return getPageDomain();
    }
}
