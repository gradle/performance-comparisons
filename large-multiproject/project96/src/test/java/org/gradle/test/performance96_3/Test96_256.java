package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_256 {
    private final Production96_256 production = new Production96_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}