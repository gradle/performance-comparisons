package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_370 {
    private final Production98_370 production = new Production98_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}