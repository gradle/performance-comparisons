package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_153 {
    private final Production96_153 production = new Production96_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}