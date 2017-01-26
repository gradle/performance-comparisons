package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_376 {
    private final Production35_376 production = new Production35_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}