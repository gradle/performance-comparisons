package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_22 {
    private final Production96_22 production = new Production96_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}