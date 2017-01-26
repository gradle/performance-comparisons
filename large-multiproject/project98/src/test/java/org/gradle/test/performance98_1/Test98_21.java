package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_21 {
    private final Production98_21 production = new Production98_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}