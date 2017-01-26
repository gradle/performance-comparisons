package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_236 {
    private final Production96_236 production = new Production96_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}