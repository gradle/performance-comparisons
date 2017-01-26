package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_430 {
    private final Production96_430 production = new Production96_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}