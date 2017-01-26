package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_385 {
    private final Production35_385 production = new Production35_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}