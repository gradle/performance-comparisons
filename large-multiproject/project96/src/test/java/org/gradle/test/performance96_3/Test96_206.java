package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_206 {
    private final Production96_206 production = new Production96_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}