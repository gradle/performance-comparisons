package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_197 {
    private final Production96_197 production = new Production96_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}