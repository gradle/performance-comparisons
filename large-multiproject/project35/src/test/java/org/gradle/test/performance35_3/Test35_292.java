package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_292 {
    private final Production35_292 production = new Production35_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}