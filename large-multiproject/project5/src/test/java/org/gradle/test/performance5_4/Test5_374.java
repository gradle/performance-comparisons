package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_374 {
    private final Production5_374 production = new Production5_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}