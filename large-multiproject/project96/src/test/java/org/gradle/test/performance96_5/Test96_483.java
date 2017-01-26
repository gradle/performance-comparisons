package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_483 {
    private final Production96_483 production = new Production96_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}