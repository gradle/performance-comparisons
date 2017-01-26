package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_491 {
    private final Production96_491 production = new Production96_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}