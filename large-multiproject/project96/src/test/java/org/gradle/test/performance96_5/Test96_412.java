package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_412 {
    private final Production96_412 production = new Production96_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}