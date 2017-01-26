package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_374 {
    private final Production93_374 production = new Production93_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}