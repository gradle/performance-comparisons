package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_132 {
    private final Production35_132 production = new Production35_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}