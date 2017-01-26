package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_312 {
    private final Production98_312 production = new Production98_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}