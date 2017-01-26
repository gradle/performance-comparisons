package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_336 {
    private final Production96_336 production = new Production96_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}