package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_27 {
    private final Production23_27 production = new Production23_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}