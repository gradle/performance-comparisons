package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_451 {
    private final Production96_451 production = new Production96_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}