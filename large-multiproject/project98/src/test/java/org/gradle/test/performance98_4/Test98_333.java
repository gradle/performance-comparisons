package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_333 {
    private final Production98_333 production = new Production98_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}