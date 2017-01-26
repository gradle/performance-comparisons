package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_194 {
    private final Production96_194 production = new Production96_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}