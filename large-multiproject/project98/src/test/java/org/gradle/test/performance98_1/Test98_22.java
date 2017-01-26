package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_22 {
    private final Production98_22 production = new Production98_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}