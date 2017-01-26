package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_414 {
    private final Production80_414 production = new Production80_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}