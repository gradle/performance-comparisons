package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_384 {
    private final Production96_384 production = new Production96_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}