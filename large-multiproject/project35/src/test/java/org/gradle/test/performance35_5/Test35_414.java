package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_414 {
    private final Production35_414 production = new Production35_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}