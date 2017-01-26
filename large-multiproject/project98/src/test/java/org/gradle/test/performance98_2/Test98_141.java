package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_141 {
    private final Production98_141 production = new Production98_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}