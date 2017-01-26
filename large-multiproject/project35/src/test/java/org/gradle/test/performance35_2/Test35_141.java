package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_141 {
    private final Production35_141 production = new Production35_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}