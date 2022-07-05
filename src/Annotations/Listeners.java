package Annotations;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;


public class Listeners implements ITestListener {
  @Test
  public void f() {
  }

@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("----------The test is started------------");
}

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("--------Test Passed----------------");
}

@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("------------Test Failed---------" + result.getName());
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestSkipped(result);
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
}

@Override
public void onTestFailedWithTimeout(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestFailedWithTimeout(result);
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	System.out.println("------On start-----------");
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	System.out.println("-------------Test execution finished------------");
}
}
