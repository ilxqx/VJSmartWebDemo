package cn.ixiaopeng.web.controller;

import cn.ixiaopeng.vj.smart.annotation.Controller;
import cn.ixiaopeng.vj.smart.annotation.Method;
import cn.ixiaopeng.vj.smart.core.Helper;
import cn.ixiaopeng.vj.smart.core.View;

@Controller
public class MainController {

	/**
	 * test Method
	 * @return
	 */
	@Method("get:/hello")
	public View hello () {
		return Helper.view("main/hello.jsp").addDataToModel("name", "Hello World!");
	}
}
