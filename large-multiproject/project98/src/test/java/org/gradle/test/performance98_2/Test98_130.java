package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_130 {
    private final Production98_130 production = new Production98_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}