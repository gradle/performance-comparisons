package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_223 {
    private final Production23_223 production = new Production23_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}