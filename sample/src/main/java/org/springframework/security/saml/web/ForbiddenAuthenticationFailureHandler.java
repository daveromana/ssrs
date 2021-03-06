package org.springframework.security.saml.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class ForbiddenAuthenticationFailureHandler implements AuthenticationFailureHandler {

    protected final Log logger = LogFactory.getLog(getClass());

	@Override
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
		response.sendError(HttpServletResponse.SC_FORBIDDEN);
	}

}
