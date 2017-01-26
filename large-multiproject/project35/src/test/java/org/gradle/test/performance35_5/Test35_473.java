package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_473 {
    private final Production35_473 production = new Production35_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}