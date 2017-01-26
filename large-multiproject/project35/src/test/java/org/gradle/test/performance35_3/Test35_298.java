package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_298 {
    private final Production35_298 production = new Production35_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}