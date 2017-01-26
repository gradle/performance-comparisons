package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_413 {
    private final Production98_413 production = new Production98_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}