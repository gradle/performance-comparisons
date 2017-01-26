package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_301 {
    private final Production96_301 production = new Production96_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}