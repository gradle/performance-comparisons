package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_327 {
    private final Production35_327 production = new Production35_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}