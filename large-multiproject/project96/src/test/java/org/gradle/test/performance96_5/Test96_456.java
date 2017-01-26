package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_456 {
    private final Production96_456 production = new Production96_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}