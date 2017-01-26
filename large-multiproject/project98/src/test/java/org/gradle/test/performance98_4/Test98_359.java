package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_359 {
    private final Production98_359 production = new Production98_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}