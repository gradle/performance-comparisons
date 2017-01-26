package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_428 {
    private final Production96_428 production = new Production96_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}