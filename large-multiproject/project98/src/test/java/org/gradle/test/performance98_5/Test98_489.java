package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_489 {
    private final Production98_489 production = new Production98_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}