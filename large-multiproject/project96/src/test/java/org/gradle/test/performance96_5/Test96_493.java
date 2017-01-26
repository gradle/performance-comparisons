package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_493 {
    private final Production96_493 production = new Production96_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}