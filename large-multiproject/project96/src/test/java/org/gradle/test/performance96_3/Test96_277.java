package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_277 {
    private final Production96_277 production = new Production96_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}