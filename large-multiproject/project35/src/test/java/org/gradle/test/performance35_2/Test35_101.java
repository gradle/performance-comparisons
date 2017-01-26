package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_101 {
    private final Production35_101 production = new Production35_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}