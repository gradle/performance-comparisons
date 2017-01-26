package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_105 {
    private final Production96_105 production = new Production96_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}