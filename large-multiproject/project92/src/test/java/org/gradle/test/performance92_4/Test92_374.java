package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_374 {
    private final Production92_374 production = new Production92_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}