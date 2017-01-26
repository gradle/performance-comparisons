package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_391 {
    private final Production96_391 production = new Production96_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}