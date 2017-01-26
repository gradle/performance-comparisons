package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_368 {
    private final Production98_368 production = new Production98_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}