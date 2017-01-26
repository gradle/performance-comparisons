package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_490 {
    private final Production96_490 production = new Production96_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}