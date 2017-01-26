package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_374 {
    private final Production77_374 production = new Production77_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}