package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_261 {
    private final Production96_261 production = new Production96_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}