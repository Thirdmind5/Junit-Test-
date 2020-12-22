package maventest2;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;



//@ExtendWith(Suite.class)
@RunWith(Suite.class)
@SuiteClasses({firstTest.class, ThirdTest.class, testerclass2Test.class})
public class AllTestsOneTest {
		

}
