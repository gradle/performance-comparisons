package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_451 {
    private final Production35_451 production = new Production35_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}