package com.org.testrunner;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.org.test")
@IncludeClassNamePatterns({".*cases",".*Test"})
public class JunitRunnerAllTest {

	
}
