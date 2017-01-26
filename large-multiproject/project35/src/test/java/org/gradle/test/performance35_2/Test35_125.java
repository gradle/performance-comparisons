package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_125 {
    private final Production35_125 production = new Production35_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}