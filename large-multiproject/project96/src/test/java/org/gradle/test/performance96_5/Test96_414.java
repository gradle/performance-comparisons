package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_414 {
    private final Production96_414 production = new Production96_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}