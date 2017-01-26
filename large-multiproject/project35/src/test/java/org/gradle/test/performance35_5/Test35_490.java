package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_490 {
    private final Production35_490 production = new Production35_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}