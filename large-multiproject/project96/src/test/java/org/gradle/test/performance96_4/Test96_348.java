package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_348 {
    private final Production96_348 production = new Production96_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}