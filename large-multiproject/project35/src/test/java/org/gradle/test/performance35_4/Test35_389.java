package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_389 {
    private final Production35_389 production = new Production35_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}