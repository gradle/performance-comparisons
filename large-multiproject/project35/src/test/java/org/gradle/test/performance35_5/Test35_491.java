package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_491 {
    private final Production35_491 production = new Production35_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}