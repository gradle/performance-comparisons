package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_273 {
    private final Production96_273 production = new Production96_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}