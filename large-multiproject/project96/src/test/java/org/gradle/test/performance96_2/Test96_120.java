package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_120 {
    private final Production96_120 production = new Production96_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}