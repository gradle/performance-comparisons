package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_272 {
    private final Production96_272 production = new Production96_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}