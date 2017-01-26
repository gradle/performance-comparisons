package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_311 {
    private final Production96_311 production = new Production96_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}