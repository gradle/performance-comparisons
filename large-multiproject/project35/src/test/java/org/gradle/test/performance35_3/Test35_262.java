package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_262 {
    private final Production35_262 production = new Production35_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}