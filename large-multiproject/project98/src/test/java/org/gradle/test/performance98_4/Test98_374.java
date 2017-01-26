package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_374 {
    private final Production98_374 production = new Production98_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}