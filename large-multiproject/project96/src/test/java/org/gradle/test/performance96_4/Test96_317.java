package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_317 {
    private final Production96_317 production = new Production96_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}