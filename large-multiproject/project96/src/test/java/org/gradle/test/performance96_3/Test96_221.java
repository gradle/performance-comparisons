package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_221 {
    private final Production96_221 production = new Production96_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}