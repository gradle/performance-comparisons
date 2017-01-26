package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_132 {
    private final Production96_132 production = new Production96_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}