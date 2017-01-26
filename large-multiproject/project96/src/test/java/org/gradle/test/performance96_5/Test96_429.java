package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_429 {
    private final Production96_429 production = new Production96_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}