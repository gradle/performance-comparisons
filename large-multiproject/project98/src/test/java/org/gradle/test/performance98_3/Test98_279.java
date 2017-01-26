package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_279 {
    private final Production98_279 production = new Production98_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}