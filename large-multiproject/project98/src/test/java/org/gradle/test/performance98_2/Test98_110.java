package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_110 {
    private final Production98_110 production = new Production98_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}