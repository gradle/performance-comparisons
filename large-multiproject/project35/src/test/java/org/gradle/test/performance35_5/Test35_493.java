package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_493 {
    private final Production35_493 production = new Production35_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}