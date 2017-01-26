package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_413 {
    private final Production96_413 production = new Production96_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}