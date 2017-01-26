package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_184 {
    private final Production96_184 production = new Production96_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}