package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_319 {
    private final Production96_319 production = new Production96_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}