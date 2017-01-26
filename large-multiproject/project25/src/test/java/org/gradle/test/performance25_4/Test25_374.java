package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_374 {
    private final Production25_374 production = new Production25_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}