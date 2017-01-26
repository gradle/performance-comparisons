package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_117 {
    private final Production96_117 production = new Production96_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}