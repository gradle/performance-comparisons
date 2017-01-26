package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_374 {
    private final Production47_374 production = new Production47_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}