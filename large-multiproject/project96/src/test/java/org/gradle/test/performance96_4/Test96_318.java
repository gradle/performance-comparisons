package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_318 {
    private final Production96_318 production = new Production96_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}