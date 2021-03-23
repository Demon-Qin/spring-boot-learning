package online.daobao.boot.web.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 囧态汗
 * @date 2021/3/23
 * @description AjaxResponse
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AjaxResponse {
    /**
     * 请求响应状态码（200、400、500）
     */

    private Integer code;
    /**
     * 请求结果描述信息
     */

    private String message;
    /**
     * 请求返回数据
     */

    private Object data;

    public static AjaxResponse success(){
        AjaxResponse ajaxResponse =new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        return ajaxResponse;
    }
    public static AjaxResponse success(Object obj){
        AjaxResponse ajaxResponse =new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }
    public static AjaxResponse success(Object obj, String
            message) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(message);
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }
    public static AjaxResponse failure(String message){
        AjaxResponse ajaxResponse =new AjaxResponse();
        ajaxResponse.setCode(5001);
        ajaxResponse.setMessage(message);
        return ajaxResponse;
    }
}
