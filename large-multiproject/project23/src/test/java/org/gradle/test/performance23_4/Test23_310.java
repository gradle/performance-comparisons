package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_310 {
    private final Production23_310 production = new Production23_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}