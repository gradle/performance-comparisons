package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_344 {
    private final Production98_344 production = new Production98_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}