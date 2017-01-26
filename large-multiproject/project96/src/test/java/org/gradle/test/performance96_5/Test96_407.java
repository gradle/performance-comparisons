package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_407 {
    private final Production96_407 production = new Production96_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}