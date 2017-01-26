package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_211 {
    private final Production96_211 production = new Production96_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}