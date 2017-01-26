package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_368 {
    private final Production35_368 production = new Production35_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}