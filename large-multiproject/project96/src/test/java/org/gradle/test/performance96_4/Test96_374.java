package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_374 {
    private final Production96_374 production = new Production96_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}