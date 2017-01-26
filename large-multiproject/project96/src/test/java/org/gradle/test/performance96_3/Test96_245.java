package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_245 {
    private final Production96_245 production = new Production96_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}