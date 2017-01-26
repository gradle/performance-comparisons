package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_123 {
    private final Production96_123 production = new Production96_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}