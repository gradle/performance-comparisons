package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_250 {
    private final Production98_250 production = new Production98_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}