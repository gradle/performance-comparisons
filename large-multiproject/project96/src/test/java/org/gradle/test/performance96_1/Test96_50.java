package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_50 {
    private final Production96_50 production = new Production96_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}