package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_304 {
    private final Production96_304 production = new Production96_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}