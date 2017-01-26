package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_123 {
    private final Production23_123 production = new Production23_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}