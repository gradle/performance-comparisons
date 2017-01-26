package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_275 {
    private final Production35_275 production = new Production35_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}