package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_346 {
    private final Production98_346 production = new Production98_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}