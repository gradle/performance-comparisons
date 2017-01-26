package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_328 {
    private final Production98_328 production = new Production98_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}