package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_374 {
    private final Production13_374 production = new Production13_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}