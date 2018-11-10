package cn.ibilidi.AllException;

import cn.ibilidi.enums.ResultEnum;

public class AllException extends RuntimeException {

    private Integer code;

    public AllException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

   public AllException(Integer code, java.lang.String message){

        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
