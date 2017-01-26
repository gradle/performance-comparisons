package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_359 {
    private final Production96_359 production = new Production96_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}