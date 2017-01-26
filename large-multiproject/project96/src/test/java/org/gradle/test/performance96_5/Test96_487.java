package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_487 {
    private final Production96_487 production = new Production96_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}