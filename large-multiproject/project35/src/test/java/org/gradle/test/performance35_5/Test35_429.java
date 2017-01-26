package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_429 {
    private final Production35_429 production = new Production35_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}