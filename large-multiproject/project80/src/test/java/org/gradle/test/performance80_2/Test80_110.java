package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_110 {
    private final Production80_110 production = new Production80_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}