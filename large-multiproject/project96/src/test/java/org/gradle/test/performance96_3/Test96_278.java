package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_278 {
    private final Production96_278 production = new Production96_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}