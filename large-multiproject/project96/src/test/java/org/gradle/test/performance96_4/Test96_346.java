package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_346 {
    private final Production96_346 production = new Production96_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}