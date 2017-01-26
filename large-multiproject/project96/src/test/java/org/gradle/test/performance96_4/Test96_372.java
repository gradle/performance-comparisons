package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_372 {
    private final Production96_372 production = new Production96_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}