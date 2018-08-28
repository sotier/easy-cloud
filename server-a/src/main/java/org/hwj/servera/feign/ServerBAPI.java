package org.hwj.servera.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: huangwenjun
 * @Description:
 * @Date: Created in 16:38  2018/8/27
 **/
@FeignClient("server-b")
public interface ServerBAPI {

	@RequestMapping(method = RequestMethod.GET, value = "/hi")
	String hi();
}
