package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_494 {
    private final Production96_494 production = new Production96_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}