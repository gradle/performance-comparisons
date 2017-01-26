package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_258 {
    private final Production96_258 production = new Production96_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}