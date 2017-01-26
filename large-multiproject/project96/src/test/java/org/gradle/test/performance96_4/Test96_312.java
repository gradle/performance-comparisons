package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_312 {
    private final Production96_312 production = new Production96_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}