package com.abc.myrequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyRequest extends HttpServletRequestWrapper {

	HttpServletRequest request;

	public MyRequest(HttpServletRequest request) {
		super(request);
		this.request = request;
	}

	@Override
	public String getParameter(String type) {// useremail

		String data = request.getParameter(type);
		if (type.equals("useremail")) {
			if (!data.endsWith("@abcfortech.com")) {
				data += "@abcfortech.com";
			}

		}

		return data;
	}

}
