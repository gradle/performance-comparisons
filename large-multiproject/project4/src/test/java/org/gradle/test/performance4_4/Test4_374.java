package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_374 {
    private final Production4_374 production = new Production4_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}