package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_132 {
    private final Production98_132 production = new Production98_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}