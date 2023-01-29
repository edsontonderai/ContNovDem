package SeleniumExerciseOne;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class seleniumJU {
    @BeforeEach
    public void Setup(){
        System.out.println("running setup1");
    }
    @Test
    public void Test1(){
        System.out.println("running TEst1");
    }

    @AfterEach
    public void teardown(){
        System.out.println("closing the browser");
    }
}
