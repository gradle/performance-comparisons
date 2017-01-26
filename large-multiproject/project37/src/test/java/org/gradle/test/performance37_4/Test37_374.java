package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_374 {
    private final Production37_374 production = new Production37_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}