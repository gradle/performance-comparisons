package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_463 {
    private final Production96_463 production = new Production96_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}