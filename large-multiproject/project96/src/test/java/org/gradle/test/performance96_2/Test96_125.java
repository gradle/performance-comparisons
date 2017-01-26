package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_125 {
    private final Production96_125 production = new Production96_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}