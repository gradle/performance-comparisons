package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_478 {
    private final Production96_478 production = new Production96_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}