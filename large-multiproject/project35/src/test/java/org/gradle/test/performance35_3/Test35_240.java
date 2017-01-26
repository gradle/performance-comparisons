package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_240 {
    private final Production35_240 production = new Production35_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}