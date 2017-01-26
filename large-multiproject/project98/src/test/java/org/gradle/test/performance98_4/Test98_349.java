package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_349 {
    private final Production98_349 production = new Production98_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}