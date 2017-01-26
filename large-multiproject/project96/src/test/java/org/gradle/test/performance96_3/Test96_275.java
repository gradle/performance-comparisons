package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_275 {
    private final Production96_275 production = new Production96_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}