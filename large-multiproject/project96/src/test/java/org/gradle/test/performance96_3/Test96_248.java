package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_248 {
    private final Production96_248 production = new Production96_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}