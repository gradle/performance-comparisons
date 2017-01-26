package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_389 {
    private final Production96_389 production = new Production96_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}