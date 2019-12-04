package zylsm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
   * 启动类
 * @author 赵通
 *
 */
@SpringBootApplication
@MapperScan(basePackages="zylsm.mapper")
public class MxdStart {
	
	public static void main(String[] args) {
		SpringApplication.run(MxdStart.class);
	}
}
