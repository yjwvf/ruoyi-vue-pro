package cn.iocoder.yudao.module.jl.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

public interface ErrorCodeConstants {
    ErrorCode INSTITUTION_NOT_EXISTS = new ErrorCode(2001000001, "CRM 模块的机构/公司不存在");

    ErrorCode COMPETITOR_NOT_EXISTS = new ErrorCode(2002000001, "友商不存在");

    ErrorCode CUSTOMER_NOT_EXISTS = new ErrorCode(2003000001, "客户不存在");

    ErrorCode FOLLOWUP_NOT_EXISTS = new ErrorCode(2004000001, "销售跟进不存在");

    ErrorCode SALESLEAD_NOT_EXISTS = new ErrorCode(2005000001, "销售线索不存在");

    ErrorCode JOIN_CUSTOMER2SALE_NOT_EXISTS = new ErrorCode(2006000001, "客户所属的销售人员不存在");

    ErrorCode JOIN_SALESLEAD2COMPETITOR_NOT_EXISTS = new ErrorCode(2007000001, "销售线索中竞争对手的报价不存在");

    ErrorCode JOIN_SALESLEAD2CUSTOMERPLAN_NOT_EXISTS = new ErrorCode(2008000001, "销售线索中的客户方案不存在");

    ErrorCode JOIN_SALESLEAD2MANAGER_NOT_EXISTS = new ErrorCode(2009000001, "销售线索中的项目售前支持人员不存在");

    ErrorCode JOIN_SALESLEAD2REPORT_NOT_EXISTS = new ErrorCode(2010000001, "销售线索中的方案不存在");

    ErrorCode PROJECT_NOT_EXISTS = new ErrorCode(2011000001, "项目管理不存在");

    ErrorCode USER_NOT_EXISTS = new ErrorCode(2012000001, "公司用户不存在");

    ErrorCode CHARGE_ITEM_NOT_EXISTS = new ErrorCode(2013000001, "项目收费项不存在");

    ErrorCode SUPPLY_NOT_EXISTS = new ErrorCode(2014000001, "实验物资不存在");

    ErrorCode PROJECT_FUND_NOT_EXISTS = new ErrorCode(2015000001, "实验物资不存在");

    ErrorCode CATEGORY_REFERENCE_NOT_EXISTS = new ErrorCode(2016000001, "实验名目的参考资料不存在");

    ErrorCode CATEGORY_SUPPLY_NOT_EXISTS = new ErrorCode(2017000001, "实验名目的物资不存在");

    ErrorCode CATEGORY_SOP_NOT_EXISTS = new ErrorCode(2018000001, "实验名目的SOP 不存在");

    ErrorCode CATEGORY_NOT_EXISTS = new ErrorCode(2019000001, "实验名目不存在");

    ErrorCode CATEGORY_CHARGEITEM_NOT_EXISTS = new ErrorCode(2020000001, "实验名目收费项不存在");

    ErrorCode CATEGORY_SKILL_USER_NOT_EXISTS = new ErrorCode(2021000001, "实验名目技术人员不存在");
}