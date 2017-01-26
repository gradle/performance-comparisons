package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_301 {
    private final Production98_301 production = new Production98_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}