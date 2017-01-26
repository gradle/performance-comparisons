package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_194 {
    private final Production35_194 production = new Production35_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}