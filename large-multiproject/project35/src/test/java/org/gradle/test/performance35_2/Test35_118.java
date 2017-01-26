package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_118 {
    private final Production35_118 production = new Production35_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}