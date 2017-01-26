package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_328 {
    private final Production35_328 production = new Production35_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}