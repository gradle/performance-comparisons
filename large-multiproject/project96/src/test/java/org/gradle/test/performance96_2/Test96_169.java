package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_169 {
    private final Production96_169 production = new Production96_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}