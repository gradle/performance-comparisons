package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_383 {
    private final Production23_383 production = new Production23_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}