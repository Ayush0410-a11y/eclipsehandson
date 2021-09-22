package com.org.testrunner;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import com.org.test.testgroug1.CalcLibMultiplyTest;
import com.org.test.testgroug2.CalcLibAdditionTest;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.org.test.testgroug1","com.org.test.testgroug2"})
//@IncludeClassNamePatterns(".*cases")
//@SelectClasses({CalcLibAdditionTest.class,CalcLibMultiplyTest.class})
public class JunitRunnerTestGroup1 {

}
