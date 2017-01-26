package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_448 {
    private final Production35_448 production = new Production35_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}