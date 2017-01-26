package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_118 {
    private final Production98_118 production = new Production98_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}