package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_408 {
    private final Production96_408 production = new Production96_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}