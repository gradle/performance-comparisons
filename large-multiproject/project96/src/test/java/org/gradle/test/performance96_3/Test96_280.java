package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_280 {
    private final Production96_280 production = new Production96_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}