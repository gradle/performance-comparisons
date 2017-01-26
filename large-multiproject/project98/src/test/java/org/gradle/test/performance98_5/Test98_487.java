package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_487 {
    private final Production98_487 production = new Production98_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}