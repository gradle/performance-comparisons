package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_299 {
    private final Production96_299 production = new Production96_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}