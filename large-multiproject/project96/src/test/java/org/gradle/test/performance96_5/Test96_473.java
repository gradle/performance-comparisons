package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_473 {
    private final Production96_473 production = new Production96_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}