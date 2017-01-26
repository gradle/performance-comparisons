package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_335 {
    private final Production35_335 production = new Production35_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}