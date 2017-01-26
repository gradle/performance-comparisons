package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_389 {
    private final Production98_389 production = new Production98_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}