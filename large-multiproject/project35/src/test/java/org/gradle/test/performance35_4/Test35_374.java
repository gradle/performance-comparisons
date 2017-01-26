package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_374 {
    private final Production35_374 production = new Production35_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}