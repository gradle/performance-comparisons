package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_410 {
    private final Production96_410 production = new Production96_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}