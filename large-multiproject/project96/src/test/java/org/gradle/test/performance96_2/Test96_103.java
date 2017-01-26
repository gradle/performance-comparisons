package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_103 {
    private final Production96_103 production = new Production96_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}