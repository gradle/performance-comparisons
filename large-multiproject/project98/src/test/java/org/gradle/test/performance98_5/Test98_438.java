package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_438 {
    private final Production98_438 production = new Production98_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}