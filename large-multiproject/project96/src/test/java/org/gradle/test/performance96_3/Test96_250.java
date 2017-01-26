package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_250 {
    private final Production96_250 production = new Production96_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}