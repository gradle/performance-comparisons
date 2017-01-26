package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_128 {
    private final Production96_128 production = new Production96_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}