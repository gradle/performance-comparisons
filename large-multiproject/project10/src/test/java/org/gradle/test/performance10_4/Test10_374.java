package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_374 {
    private final Production10_374 production = new Production10_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}