package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_250 {
    private final Production35_250 production = new Production35_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}