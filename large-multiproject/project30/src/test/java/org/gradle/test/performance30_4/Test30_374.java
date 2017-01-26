package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_374 {
    private final Production30_374 production = new Production30_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}