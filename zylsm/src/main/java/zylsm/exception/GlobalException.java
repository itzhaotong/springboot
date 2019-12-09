package zylsm.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import zylsm.enums.MessageEnum;
import zylsm.respone.QueryResult;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理
 *
 * @author qinbangshuai
 * @date 2019/12/9 10:51:24
 */
@RestControllerAdvice
@Slf4j
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public QueryResult handleAuthorizationException(Exception e) {
        log.error(e.getMessage(), e);
        return new QueryResult<>(MessageEnum.error.getCode(), MessageEnum.error.getMessage(), e.getMessage());
    }
}
