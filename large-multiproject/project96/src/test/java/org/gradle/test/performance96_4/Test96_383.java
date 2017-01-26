package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_383 {
    private final Production96_383 production = new Production96_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}