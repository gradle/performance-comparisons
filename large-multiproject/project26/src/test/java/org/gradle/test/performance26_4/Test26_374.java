package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_374 {
    private final Production26_374 production = new Production26_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}