package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_327 {
    private final Production96_327 production = new Production96_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}