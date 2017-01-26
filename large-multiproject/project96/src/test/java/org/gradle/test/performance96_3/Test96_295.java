package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_295 {
    private final Production96_295 production = new Production96_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}