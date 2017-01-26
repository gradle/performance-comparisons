package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_223 {
    private final Production96_223 production = new Production96_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}