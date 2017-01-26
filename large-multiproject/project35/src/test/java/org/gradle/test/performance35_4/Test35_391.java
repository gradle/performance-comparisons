package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_391 {
    private final Production35_391 production = new Production35_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}