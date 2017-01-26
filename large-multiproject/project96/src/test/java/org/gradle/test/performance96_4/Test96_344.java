package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_344 {
    private final Production96_344 production = new Production96_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}