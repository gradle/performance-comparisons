package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_385 {
    private final Production96_385 production = new Production96_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}