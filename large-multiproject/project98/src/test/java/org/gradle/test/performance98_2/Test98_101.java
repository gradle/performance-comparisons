package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_101 {
    private final Production98_101 production = new Production98_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}