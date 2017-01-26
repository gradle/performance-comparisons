package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_375 {
    private final Production96_375 production = new Production96_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}