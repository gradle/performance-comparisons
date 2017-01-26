package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_478 {
    private final Production35_478 production = new Production35_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}