package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_141 {
    private final Production96_141 production = new Production96_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}