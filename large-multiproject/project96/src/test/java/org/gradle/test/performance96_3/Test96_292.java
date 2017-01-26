package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_292 {
    private final Production96_292 production = new Production96_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}