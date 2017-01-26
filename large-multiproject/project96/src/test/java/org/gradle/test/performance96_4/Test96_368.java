package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_368 {
    private final Production96_368 production = new Production96_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}