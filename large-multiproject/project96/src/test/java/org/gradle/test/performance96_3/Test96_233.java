package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_233 {
    private final Production96_233 production = new Production96_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}