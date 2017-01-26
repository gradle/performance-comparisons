package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_262 {
    private final Production96_262 production = new Production96_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}