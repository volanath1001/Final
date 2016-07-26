package rt;

import org.testng.ITestResult;
import org.testng.util.RetryAnalyzerCount;

public class Rt extends RetryAnalyzerCount{

	@Override
	public boolean retryMethod(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}

}
