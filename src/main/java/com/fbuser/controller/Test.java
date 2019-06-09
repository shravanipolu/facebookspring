package com.fbuser.controller;

import org.apache.log4j.Logger;

public class Test {

	public final static Logger logger = Logger.getLogger(Test.class);

	public static void main(String[] args) {
		try {
			logger.debug("debug");
			logger.info("info");
			logger.error("error");
			logger.warn("warn");
			String s = null;
			s.length();
			logger.fatal("fatal");
		} catch (Exception e) {

			logger.error("exception", e);
			// e.printStackTrace();
		}
	}
}
