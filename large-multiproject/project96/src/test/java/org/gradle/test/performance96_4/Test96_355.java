package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_355 {
    private final Production96_355 production = new Production96_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}