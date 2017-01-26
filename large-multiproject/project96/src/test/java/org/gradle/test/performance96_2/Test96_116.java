package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_116 {
    private final Production96_116 production = new Production96_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}