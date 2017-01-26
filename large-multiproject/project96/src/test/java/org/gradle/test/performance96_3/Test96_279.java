package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_279 {
    private final Production96_279 production = new Production96_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}