package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_224 {
    private final Production96_224 production = new Production96_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}