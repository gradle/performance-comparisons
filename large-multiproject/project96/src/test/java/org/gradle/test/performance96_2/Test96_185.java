package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_185 {
    private final Production96_185 production = new Production96_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}