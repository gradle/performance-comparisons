package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_335 {
    private final Production96_335 production = new Production96_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}