package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_124 {
    private final Production98_124 production = new Production98_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}