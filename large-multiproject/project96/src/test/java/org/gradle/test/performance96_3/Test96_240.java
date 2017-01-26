package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_240 {
    private final Production96_240 production = new Production96_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}