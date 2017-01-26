package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_332 {
    private final Production96_332 production = new Production96_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}