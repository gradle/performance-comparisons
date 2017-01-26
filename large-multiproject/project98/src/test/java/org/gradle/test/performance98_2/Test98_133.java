package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_133 {
    private final Production98_133 production = new Production98_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}