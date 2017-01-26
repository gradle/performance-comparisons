package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_159 {
    private final Production96_159 production = new Production96_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}