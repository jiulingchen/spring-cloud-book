package cn.springcloud.book.common.exception;

import java.io.Serializable;

/**
 * @author shannon
 */
public class BaseExceptionBody implements Serializable {
    private static final long serialVersionUID = -5622594182208342672L;

    private Long businessId;

    private Integer code;

    private String codeEN;

    private String businessMessage;

    private String exceptionType;


    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCodeEN() {
        return codeEN;
    }

    public void setCodeEN(String codeEN) {
        this.codeEN = codeEN;
    }

    public String getBusinessMessage() {
        return businessMessage;
    }

    public void setBusinessMessage(String businessMessage) {
        this.businessMessage = businessMessage;
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    public BaseExceptionBody() {
    }

    public BaseExceptionBody(BaseException exception) {
        this.businessId = exception.getBusinessId();
        this.code = exception.getCode();
        this.codeEN = exception.getCodeEN();
        this.businessMessage = exception.getBusinessMessage();
        this.exceptionType = exception.getClass().getName();
    }
}
