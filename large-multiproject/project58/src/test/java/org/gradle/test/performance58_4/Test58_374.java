package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_374 {
    private final Production58_374 production = new Production58_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}