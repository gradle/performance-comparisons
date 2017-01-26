package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_453 {
    private final Production98_453 production = new Production98_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}