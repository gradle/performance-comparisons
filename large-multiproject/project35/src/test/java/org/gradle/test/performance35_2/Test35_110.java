package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_110 {
    private final Production35_110 production = new Production35_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}