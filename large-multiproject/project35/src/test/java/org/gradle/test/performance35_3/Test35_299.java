package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_299 {
    private final Production35_299 production = new Production35_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}