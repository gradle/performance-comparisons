package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_374 {
    private final Production24_374 production = new Production24_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}