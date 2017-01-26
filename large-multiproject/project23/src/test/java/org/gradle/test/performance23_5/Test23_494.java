package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_494 {
    private final Production23_494 production = new Production23_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}